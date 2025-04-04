package com.cricboard.dto;

import com.cricboard.model.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {
    private Long orderId;
    private String fullName;
    private String email;
    private String phone;
    private String address;
    private String paymentMethod;
    private List<ProductDto> orderItems; // List of product IDs
    private String upiId;
    private int pin;
    private double totalAmount;
}
