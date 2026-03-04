package com.codes.webApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class Product {
    private int id;
    private String prodName;
    private double price;


    public Product() {
    }
}
