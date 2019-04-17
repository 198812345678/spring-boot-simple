package com.will.example.spring.jiemi.ch3;

import com.will.example.spring.jiemi.FXNewsProvider;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Ch3Test {

    @Test
    public void test() {
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext-jiemi.xml"));
        FXNewsProvider fxNewsProvider = (FXNewsProvider) beanFactory.getBean("FXNewsProvider");
        fxNewsProvider.getAndPersistNews();
    }
}
