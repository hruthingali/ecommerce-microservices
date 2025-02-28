package com.example.payment.kafka;

import com.example.payment.dto.Order; // ✅ Import the new Order DTO
import com.example.payment.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class PaymentConsumer {

    @Autowired
    private PaymentService paymentService;

    @KafkaListener(topics = "order-topic", groupId = "payment-group")
    public void processOrder(Order order) { // ✅ Use the new Order DTO
        System.out.println("Received Order: " + order);
        paymentService.processPayment(order.getId());
    }
}
