package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GreetingService {

    private final MessageService messageService;

    @Autowired
    public GreetingService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void greet() {
        System.out.println("Greeting: " + messageService.getMessage());
    }
}
