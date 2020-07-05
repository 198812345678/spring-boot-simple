package com.will.example.spring.mybatis;

import com.will.example.spring.mybatis.mapper.Test201912Mapper;
import com.will.example.spring.mybatis.model.Test201912;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by will on 20/2/6.
 */
public class MybatisSpringDemo {

    public static void main(String[] args) {
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        Test201912Mapper test201912Mapper = (Test201912Mapper)beanFactory.getBean("test201912Mapper");
        Test201912 test201912 = test201912Mapper.queryAllRecord();
        System.out.println(test201912);
    }
}
