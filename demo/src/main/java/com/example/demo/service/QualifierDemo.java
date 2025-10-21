package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class QualifierDemo {

    private final Greeting greeting;

    @Autowired
    public QualifierDemo(@Qualifier("russianGreeting") Greeting greeting) {
        this.greeting = greeting;
    }

    public void show() {
        System.out.println(greeting.greet());
    }
}