package com.example.demo.service;

import org.springframework.stereotype.Component;

@Component("paypalPaymentService")
public class PaypalPaymentService implements PaymentService {
    public void pay() { System.out.println("Paid via PayPal"); }
}