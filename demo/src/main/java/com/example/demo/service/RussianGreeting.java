package com.example.demo.service;

import org.springframework.stereotype.Component;

@Component("russianGreeting")
public class RussianGreeting implements Greeting {
    public String greet() { return "Привет!"; }
}