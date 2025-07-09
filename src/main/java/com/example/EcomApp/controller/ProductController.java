package com.example.EcomApp.controller;

import com.example.EcomApp.model.Product;
import com.example.EcomApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
//@CrossOrigin
@RequestMapping("/api")
public class ProductController {

    private final ProductService service;
    ProductController(ProductService service){
        this.service=service;
    }

    @RequestMapping("/")
    public String greet(){
        return "Welcome to ECom App";
    }

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return service.getAllProducts();
    }

}
