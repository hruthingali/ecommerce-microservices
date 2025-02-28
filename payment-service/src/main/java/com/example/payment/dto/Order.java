package com.example.payment.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data  // ✅ Generates getters, setters, and `toString()`
@Getter
@Setter
public class Order {
    private Long id;
    private Long productId;
    private int quantity;
}
