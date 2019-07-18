package com.will.example.spring.jiemi.ch4;

public class SysPropertyIniter {

    public static final String SYSTEM_INIT_KEY = "system_init_key";

    public void init() {
        System.setProperty(SYSTEM_INIT_KEY, "system_init_value");
    }
}
