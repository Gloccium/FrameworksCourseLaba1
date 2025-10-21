package com.example.demo.service;

import org.springframework.stereotype.Component;

@Component
public class MessageService {
    public String getMessage() {
        return "Constructor injection works!";
    }
}