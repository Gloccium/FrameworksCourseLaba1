package com.example.demo.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class LifecycleBean {

    @PostConstruct
    public void init() {
        System.out.println("Bean initialized!");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Bean destroyed!");
    }
}