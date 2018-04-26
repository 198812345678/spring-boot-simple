package com.will.example.spring.boot.spring.boot.bean;

public class Foo15 {

    private String str;

    private Bar bar;

    public Foo15(String str, Bar bar) {
        this.str = str;
        this.bar = bar;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public void setBar(Bar bar) {
        this.bar = bar;
    }

    @Override
    public String toString() {
        return "Foo15{" +
                "str='" + str + '\'' +
                ", bar=" + bar +
                '}';
    }
}
