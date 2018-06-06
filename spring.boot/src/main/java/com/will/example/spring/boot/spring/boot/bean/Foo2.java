package com.will.example.spring.boot.spring.boot.bean;

/**
 * @since 2018/4/17
 */
public class Foo2 extends Foo {
    private int i;
    private String str;

    public Foo2(Bar bar, Baz baz, int i, String str) {
        super(bar, baz);
        this.i = i;
        this.str = str;
    }
}
