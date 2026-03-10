package com.wipro.springsecurity.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.springsecurity.dto.Product;
import com.wipro.springsecurity.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome this endpoint is not secure";
    }

   
    @GetMapping("/getall")
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<Product> getAllTheProducts() {
        return service.getProducts();
    }

    @GetMapping("/get/{id}")
    @PreAuthorize("hasAuthority('USER')")
    public Product getProductById(@PathVariable int id) {
        return service.getProduct(id);
    }
    
}