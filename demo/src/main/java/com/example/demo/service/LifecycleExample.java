package com.example.demo.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class LifecycleExample {

    @PostConstruct
    void onInit() {
        System.out.println("LifecycleExample initialized");
    }

    @PreDestroy
    void onDestroy() {
        System.out.println("LifecycleExample destroyed");
    }
}