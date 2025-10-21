package com.example.demo.repository;

import org.springframework.stereotype.Component;

@Component
public class OrderRepository {
    public String getOrder() { return "Order #123"; }
}