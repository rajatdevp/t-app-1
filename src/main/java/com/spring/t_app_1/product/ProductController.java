package com.spring.t_app_1.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/products")
public class ProductController {

    @Autowired
    private  ProductService productService;

    @PostMapping
    public  Product insertProduct(@RequestBody Product payload){

        productService.insertProduct(payload);
        return payload;
    }
    @GetMapping()
    public List<Product> getAllProduct() {

        return productService.getAllProducts();
    }

    @GetMapping("{id}")
    public Product getProduct(@PathVariable Integer id ) {

        System.out.println(id);
        return new Product();
    }

    @PutMapping("{id}")
    public String putProduct(@PathVariable Integer id) {

        System.out.println(id);
        return "sucess";
    }

    @DeleteMapping("{id}")
    public String deleteProduct(@PathVariable Integer id) {

        System.out.println(id);
        return "user deleted";
    }

}
