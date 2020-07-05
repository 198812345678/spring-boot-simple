package com.will.example.spring.javabasic.exception;

import com.sun.webkit.ThemeClient;
import com.will.example.spring.javabasic.thread.CachedThreadPoolTest;

/**
 * Created by will on 2020/6/25.
 */
public class NoClassDefFoundErrorTest {

    static {
        init();
    }

    public NoClassDefFoundErrorTest() {
//        throw new RuntimeException();
    }

    public static void main(String[] args) throws ClassNotFoundException {
        new NoClassDefFoundErrorTest();
    }

    private static void init() {
        throw new RuntimeException();

    }
}
