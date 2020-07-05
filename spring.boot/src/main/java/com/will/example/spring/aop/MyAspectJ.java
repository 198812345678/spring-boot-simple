package com.will.example.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by will on 2020/7/3.
 */
@Component
@Aspect
public class MyAspectJ {

    @Pointcut("execution(* com.will.example.spring.aop..*.*(..))")
    public void pointcut() {

    }

    @Before("pointcut()")
    public void doBefore() {
        System.out.printf("执行 doBefore 方法");
    }
}
