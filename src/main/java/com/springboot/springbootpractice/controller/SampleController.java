package com.springboot.springbootpractice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/hello")
    public String SayHello() {
        return "Hello world";
    }

    @GetMapping("/")
    public String index() {
        return "index page";
    }
}
