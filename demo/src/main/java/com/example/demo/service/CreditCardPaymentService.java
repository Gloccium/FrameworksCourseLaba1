package com.example.demo.service;

import org.springframework.stereotype.Component;

@Component("creditCardPaymentService")
public class CreditCardPaymentService implements PaymentService {
    public void pay() { System.out.println("Paid by Credit Card"); }
}