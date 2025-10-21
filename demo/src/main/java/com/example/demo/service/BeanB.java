package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanB {
    @Autowired
    private BeanA beanA;

    public void action() {
        System.out.println("BeanB uses BeanA");
    }
}