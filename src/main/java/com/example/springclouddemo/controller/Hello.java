package com.example.springclouddemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author lenovo
 * @Description:
 * @Date created at 11:12 2022/6/11
 * @Modified by lenovo
 **/
@RestController
public class Hello {
    @GetMapping("/hello")
    public String hello() {
        return "hello, world!";
    }
    public String hi() {
        return "hi";
    }
}
