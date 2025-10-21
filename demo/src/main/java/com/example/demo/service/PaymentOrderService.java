package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PaymentOrderService {

    @Autowired
    @Qualifier("paypalPaymentService")
    private PaymentService paymentService;

    public void processPayment() {
        paymentService.pay();
    }
}