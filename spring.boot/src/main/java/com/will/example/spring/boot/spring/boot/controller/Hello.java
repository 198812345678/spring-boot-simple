package com.will.example.spring.boot.spring.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by will on 19/4/20.
 */
@RestController
public class Hello {

    @RequestMapping("/")
    String home() {
        return "Hello";
    }
}
