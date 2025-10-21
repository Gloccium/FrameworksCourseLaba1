package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanA {
    @Autowired
    private BeanB beanB;

    public void action() {
        System.out.println("BeanA uses BeanB");
    }
}