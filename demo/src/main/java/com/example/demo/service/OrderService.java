package com.example.demo.service;

import com.example.demo.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public void printOrder() {
        System.out.println("Order: " + orderRepository.getOrder());
    }
}