package com.will.example.spring.refreshproperties;

import java.lang.reflect.Method;
import java.util.Objects;
import java.util.Properties;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import org.springframework.core.BridgeMethodResolver;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.env.PropertySource;
import org.springframework.util.ReflectionUtils;
import org.springframework.util.StringUtils;

/**
 * @author hujunzheng
 * @create 2018-07-04 15:45
 **/
public class ConfigCenterUtils {
  private static PropertySource propertySource = new PropertiesPropertySource("1111111111", new Properties());

  //判断配置中心属性是否刷新
  public synchronized static boolean propertySourceRefresh(PropertySource newPropertySource) {
//    if (propertySource.equals(newPropertySource)) {
//      return false;
//    }
//
//    if (propertySource.hashCode() == newPropertySource.hashCode()) {
//      return false;
//    }
//
//    propertySource = newPropertySource;
    return true;
  }

  //创建代理类，代理@ToRefresh注解的方法，调用相应的刷新方法
  public static <T> T createToRefreshPropertiesBean(Class<T> clazz) {
    Enhancer enhancer = new Enhancer();
    // 设置代理对象父类
    enhancer.setSuperclass(clazz);
    // 设置增强
    enhancer.setCallback(new MethodInterceptor() {
      @Override
      public Object intercept(Object target, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        ToRefresh toRefresh = AnnotationUtils.findAnnotation(method, ToRefresh.class);
        if (Objects.isNull(toRefresh) || StringUtils.isEmpty(toRefresh.method())) {
          return methodProxy.invokeSuper(target, args);
        }
        Method refreshMethod = ReflectionUtils.findMethod(target.getClass(), toRefresh.method());
        if (Objects.isNull(refreshMethod)) {
          return methodProxy.invokeSuper(target, args);
        }
        refreshMethod = BridgeMethodResolver.findBridgedMethod(refreshMethod);
        refreshMethod.setAccessible(true);
        refreshMethod.invoke(target, null);
        return methodProxy.invokeSuper(target, args);
      }
    });
    return (T) enhancer.create();// 创建代理对象
  }
}
