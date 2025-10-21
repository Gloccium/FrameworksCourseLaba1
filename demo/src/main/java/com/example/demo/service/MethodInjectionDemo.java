package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MethodInjectionDemo {

    private HelloService helloService;

    @Autowired
    public void setup(HelloService helloService) {
        this.helloService = helloService;
    }

    public void run() {
        System.out.println("Injected via method: " + helloService.sayHello());
    }
}