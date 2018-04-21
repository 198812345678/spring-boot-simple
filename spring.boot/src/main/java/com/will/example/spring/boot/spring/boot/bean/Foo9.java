package com.will.example.spring.boot.spring.boot.bean;

import java.util.Properties;

public class Foo9{

    private Properties properties;

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Foo9{" +
                "properties=" + properties +
                '}';
    }
}
