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

}
