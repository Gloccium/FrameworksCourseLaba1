package com.example.demo.repository;

import org.springframework.stereotype.Component;

@Component
public class ProductRepository {
    public String getProduct() { return "Coffee"; }
}