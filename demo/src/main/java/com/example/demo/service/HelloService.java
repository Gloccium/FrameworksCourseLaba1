package com.example.demo.service;

import org.springframework.stereotype.Component;

@Component
public class HelloService {
    public String sayHello() {
        return "Hello, Spring!";
    }
}