package com.spring.t_app_1.product;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private List<Product> productTable= new ArrayList<>();

    public Product insertProduct(Product payload){

        if(productTable.add(payload))
            return payload;

        throw new RuntimeException();
    }


    public List<Product> getAllProducts() {
        return productTable;
    }
}
