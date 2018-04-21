package com.will.example.spring.boot.spring.boot.bean;

import java.util.List;
import java.util.Properties;

public class Foo11 {

    private List<String> barList;

    private Properties properties;

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void setBarList(List<String> barList) {
        this.barList = barList;
    }

    @Override
    public String toString() {
        return "Foo11{" +
                "barList=" + barList +
                ", properties=" + properties +
                '}';
    }
}
