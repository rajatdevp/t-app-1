package com.spring.t_app_1.product;


import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/products")
public class ProductController {

    @PostMapping
    public  Product insertProduct(@RequestBody Product payload){

        System.err.println("Product inserted: " + payload);

        return payload;
    }

    @GetMapping("{id}")
    public Product getProduct(@PathVariable Integer id )
    {
        System.out.println(id);
        return new Product();
    }

    @PutMapping("{id}")
    public String putProduct(@PathVariable Integer id)
    {
        System.out.println(id);
        return "sucess";
    }

    @DeleteMapping("{id}")
    public String deleteProduct(@PathVariable Integer id)
    {
        System.out.println(id);
        return "user deleted";
    }

}
