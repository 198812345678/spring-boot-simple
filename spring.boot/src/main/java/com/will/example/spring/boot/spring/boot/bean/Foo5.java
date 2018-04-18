package com.will.example.spring.boot.spring.boot.bean;

import java.beans.ConstructorProperties;

/**
 * @author wangwei02@corp.netease.com
 * @since 2018/4/17
 */
public class Foo5{

    @ConstructorProperties({"a", "b"})
    public Foo5(int x, int y) {
        this.x = x;
        this.y = y;
    }

//    public int getAd() {
//        return x;
//    }
//
//    public int getBd() {
//        return y;
//    }

    private final int x, y;

    @Override
    public String toString() {
        return "Foo5{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
