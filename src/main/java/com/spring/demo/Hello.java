package com.spring.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping(path = "/hello")
    public String helloWorld() {
        return "Hello Worls";
    }
    
}