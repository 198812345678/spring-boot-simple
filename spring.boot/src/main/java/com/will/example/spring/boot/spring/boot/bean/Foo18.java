package com.will.example.spring.boot.spring.boot.bean;

public class Foo18 extends Foo {
    public Foo18(Bar bar, Baz baz) {
        super(bar, baz);
    }

    @Override
    public String toString() {
        return "Foo18{" +
                "bar=" + bar +
                ", baz=" + baz +
                '}';
    }
}
