package com.will.example.spring.boot.spring.boot.bean;

/**
 * @since 2018/4/17
 */
public class Bar {

    private int i;

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "Bar{" +
                "i=" + i +
                '}';
    }
}
