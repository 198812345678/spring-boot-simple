package com.will.example.spring.boot.spring.boot.bean;

public class Foo10 {

    private Bar bar;
    private Baz baz;
    private String str;

    public void setStr(String str) {
        this.str = str;
    }

    public void setBar(Bar bar) {
        this.bar = bar;
    }

    public void setBaz(Baz baz) {
        this.baz = baz;
    }

    public Bar getBar() {
        return bar;
    }

    public Baz getBaz() {
        return baz;
    }

    @Override
    public String toString() {
        return "Foo10{" +
                "bar=" + bar +
                ", baz=" + baz +
                ", str='" + str + '\'' +
                '}';
    }
}
