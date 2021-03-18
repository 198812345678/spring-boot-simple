package com.will.example.spring.refreshproperties;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * @author hujunzheng
 * @create 2018-07-06 9:59
 **/
@Target({METHOD})
@Retention(RUNTIME)
@Documented
public @interface ToRefresh {
  //刷新方法
  String method() default "";
}