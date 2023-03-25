package com.example.spring.debugging.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {

    @Autowired
    private Environment environment;

    @RequestMapping("/test")
    public String test() {
        return "test" + environment.getProperty("SPRING_PROFILES_ACTIVE");
    }
}
