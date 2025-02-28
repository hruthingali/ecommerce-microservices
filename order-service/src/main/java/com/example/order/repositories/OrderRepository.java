package com.example.order.repositories;

import com.example.order.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    // Custom query to find orders by productId (if needed)
    List<Order> findByProductId(Long productId);
}
