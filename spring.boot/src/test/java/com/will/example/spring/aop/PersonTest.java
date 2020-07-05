package com.will.example.spring.aop;

import com.will.example.spring.boot.spring.boot.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * Created by will on 2020/7/3.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class PersonTest {

    @Resource
    private Person person;

    @Test
    public void test() {
        person.getId();
    }
}
