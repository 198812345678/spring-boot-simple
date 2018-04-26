package com.will.example.spring.boot.spring.boot.bean;

public class Foo13 {

    private String str1;

    private String str2;

    private Integer i1;

    public void setStr1(String str1) {
        this.str1 = str1;
    }

    public void setStr2(String str2) {
        this.str2 = str2;
    }

    public void setI1(Integer i1) {
        this.i1 = i1;
    }

    @Override
    public String toString() {
        return "Foo13{" +
                "str1='" + str1 + '\'' +
                ", str2='" + str2 + '\'' +
                ", i1=" + i1 +
                '}';
    }
}
