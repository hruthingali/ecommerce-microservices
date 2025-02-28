package com.example.order.kafka;

import com.example.order.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class OrderProducer {

    @Autowired
    private KafkaTemplate<String, Order> kafkaTemplate;

    public void sendOrderEvent(Order order) {
        kafkaTemplate.send("order-topic", order);
    }
}
