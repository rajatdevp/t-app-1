package com.spring.t_app_1.product;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/products")
public class ProductController {

    @PostMapping
    public  Product insertProduct(@RequestBody Product payload){

        System.err.println("Product inserted: " + payload);

        return payload;
    }

}
