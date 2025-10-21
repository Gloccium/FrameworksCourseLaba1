package com.example.demo.service;

import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository repo) {
        this.userRepository = repo;
    }

    public void showUser() {
        System.out.println("User: " + userRepository.getUser());
    }
}