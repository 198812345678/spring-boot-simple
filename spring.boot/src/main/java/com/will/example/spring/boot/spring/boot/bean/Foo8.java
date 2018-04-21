package com.will.example.spring.boot.spring.boot.bean;

import java.util.Properties;

public class Foo8 {

    private String str;

    private Properties properties;
//
//    public String getStr() {
//        return str;
//    }


    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Foo8{" +
                "str='" + str + '\'' +
                '}';
    }
}
