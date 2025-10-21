package com.example.demo.repository;

import org.springframework.stereotype.Component;

@Component
public class UserRepository {
    public String getUser() {
        return "John Doe";
    }
}