package com.will.example.spring.aop;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by will on 2020/7/3.
 */

@Component("person")
public class Person {

    @Resource
    private Person person;

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
