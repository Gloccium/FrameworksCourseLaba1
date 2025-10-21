package com.example.demo.service;

public class FactoryProduct {
    private final String message;

    public FactoryProduct(String message) {
        this.message = message;
    }

    public void show() {
        System.out.println(message);
    }
}