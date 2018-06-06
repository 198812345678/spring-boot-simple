package com.will.example.spring.boot.spring.boot.bean;

/**
 * @since 2018/4/17
 */
public class Foo {

    protected Bar bar;

    protected Baz baz;

    public Foo(Bar bar, Baz baz) {
        this.bar = bar;
        this.baz = baz;
    }

    @Override
    public String toString() {
        return "Foo{" +
                "bar=" + bar +
                ", baz=" + baz +
                '}';
    }
}
