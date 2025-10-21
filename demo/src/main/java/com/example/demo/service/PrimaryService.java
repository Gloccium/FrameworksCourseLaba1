package com.example.demo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PrimaryService extends HelloService {
    @Override
    public String sayHello() {
        return "Hello from PrimaryService!";
    }
}