package com.will.example.spring.jiemi.ch4;

import com.will.example.spring.jiemi.FXNewsProvider;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

public class Ch4Test {

    @Test
    public void test() {
        DefaultListableBeanFactory beanRegistry = new DefaultListableBeanFactory();
        BeanFactory beanFactory = Ch4Util.bindViaCode(beanRegistry);
        FXNewsProvider djNewsProvider = (FXNewsProvider) beanFactory.getBean("djNewsProvider");
        djNewsProvider.getAndPersistNews();
    }

    @Test
    public void test2() {
        DefaultListableBeanFactory beanRegistry = new DefaultListableBeanFactory();
        BeanFactory beanFactory = Ch4Util.bindViaXMLFile(beanRegistry);
        FXNewsProvider djNewsProvider = (FXNewsProvider) beanFactory.getBean("FXNewsProvider");
        djNewsProvider.getAndPersistNews();
    }

    @Test
    public void test3() {
        DefaultListableBeanFactory beanRegistry = new DefaultListableBeanFactory();
        BeanFactory beanFactory = Ch4Util.bindViaXMLFile(beanRegistry);
        OuterBean outerBean = (OuterBean) beanFactory.getBean("outerBean");
        outerBean.getInnerBean();
    }

    @Test
    public void test4() {
        DefaultListableBeanFactory beanRegistry = new DefaultListableBeanFactory();
        BeanFactory beanFactory = Ch4Util.bindViaXMLFile(beanRegistry);
        ListFieldBean listFieldBean = (ListFieldBean) beanFactory.getBean("listFieldBean");
        listFieldBean.getArrayList();
    }

    @Test
    public void test5() {
        DefaultListableBeanFactory beanRegistry = new DefaultListableBeanFactory();
        BeanFactory beanFactory = Ch4Util.bindViaXMLFile(beanRegistry);
        MapFieldBean mapFieldBean = (MapFieldBean) beanFactory.getBean("mapFieldBean");
        mapFieldBean.getOuterBeanFXNewsProviderMap();
    }
}
