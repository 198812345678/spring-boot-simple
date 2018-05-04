package com.will.example.spring.boot.spring.boot.bean;

public class Foo17 extends Foo {
    public Foo17(Bar bar, Baz baz) {
        super(bar, baz);
    }

    @Override
    public String toString() {
        return "Foo17{" +
                "bar=" + bar +
                ", baz=" + baz +
                '}';
    }
}
