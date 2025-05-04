package com.spring.t_app_1.product;

import lombok.Data;

@Data
public class Product {

    private Integer id;
    private String name;
    private String description;
    private double price;
    private int quantity;

}
