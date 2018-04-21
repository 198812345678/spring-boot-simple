package com.will.example.spring.boot.spring.boot.bean;

import java.util.List;

public class Foo12 {

    private String name;

    private int age;

    private List<String> stringList;

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Foo12{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", stringList=" + stringList +
                '}';
    }
}
