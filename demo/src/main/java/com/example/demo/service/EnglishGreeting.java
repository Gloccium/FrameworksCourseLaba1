package com.example.demo.service;

import org.springframework.stereotype.Component;

@Component("englishGreeting")
public class EnglishGreeting implements Greeting {
    public String greet() { return "Hello!"; }
}