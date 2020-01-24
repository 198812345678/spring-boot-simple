package com.will.example.spring.mybatis;

import org.apache.ibatis.reflection.factory.DefaultObjectFactory;
import org.slf4j.Logger;

import java.util.List;

/**
 * Created by will on 20/1/23.
 */
public class MyDemoObjectFactory extends DefaultObjectFactory {


    @Override
    public <T> T create(Class<T> type)
    {
        T result = super.create(type);
        System.out.println("创建对象：" + result.toString());
        return result;
    }

    @Override
    public <T> T create(Class<T> type, List<Class<?>> constructorArgTypes, List<Object> constructorArgs)
    {
        T result = super.create(type, constructorArgTypes, constructorArgs);
        System.out.println("创建对象：" + result.toString());
        return result;
    }
}
