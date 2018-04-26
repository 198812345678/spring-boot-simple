package com.will.example.spring.boot.spring.boot.bean;

public class Foo14 {

    private String str;

    private Bar bar;

    public void setStr(String str) {
        this.str = str;
    }

    public void setBar(Bar bar) {
        this.bar = bar;
    }

    @Override
    public String toString() {
        return "Foo14{" +
                "str='" + str + '\'' +
                ", bar=" + bar +
                '}';
    }
}
