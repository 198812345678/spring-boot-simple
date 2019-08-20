package com.will.example.spring.jiemi.ch4;

import com.will.example.spring.jiemi.FXNewsProvider;
import org.junit.Assert;
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

    @Test
    public void test6() {
        DefaultListableBeanFactory beanRegistry = new DefaultListableBeanFactory();
        BeanFactory beanFactory = Ch4Util.bindViaXMLFile(beanRegistry);
        ReadSytemInitValueBean readSytemInitValueBean = (ReadSytemInitValueBean) beanFactory.getBean("readSytemInitValueBean");
    }

    @Test
    public void test7() {
        DefaultListableBeanFactory beanRegistry = new DefaultListableBeanFactory();
        BeanFactory beanFactory = Ch4Util.bindViaXMLFile(beanRegistry);
        FXNewsProvider fxNewsProvider = (FXNewsProvider) beanFactory.getBean("concreteSub");
        System.out.println(fxNewsProvider);
    }

    @Test
    public void test8() {
        DefaultListableBeanFactory beanRegistry = new DefaultListableBeanFactory();
        BeanFactory beanFactory = Ch4Util.bindViaXMLFile(beanRegistry);
        SingletonBean singletonBean = (SingletonBean) beanFactory.getBean("singletonBean");
        for (int i = 0; i < 10; i++) {
            singletonBean = (SingletonBean) beanFactory.getBean("singletonBean");
            singletonBean.setStatus(singletonBean.getStatus() + 1);
        }
        Assert.assertEquals(10, singletonBean.getStatus());

        PrototypeBean prototypeBean = (PrototypeBean) beanFactory.getBean("prototypeBean");
        for (int i = 0; i < 10; i++) {
            prototypeBean = (PrototypeBean) beanFactory.getBean("prototypeBean");
            prototypeBean.setStatus(prototypeBean.getStatus() + 1);
        }
        Assert.assertEquals(1, prototypeBean.getStatus());

    }
}
