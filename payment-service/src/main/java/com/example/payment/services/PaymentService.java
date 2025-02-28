package com.example.payment.services;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public void processPayment(Long orderId) {
        System.out.println("Processing payment for Order ID: " + orderId);
    }
}
