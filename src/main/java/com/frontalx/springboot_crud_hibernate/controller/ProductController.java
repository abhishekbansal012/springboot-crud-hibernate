package com.frontalx.springboot_crud_hibernate.controller;

import com.frontalx.springboot_crud_hibernate.domain.Product;
import com.frontalx.springboot_crud_hibernate.domain.ProductRequest;
import com.frontalx.springboot_crud_hibernate.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody ProductRequest request) {
        Product savedProduct = productService.addProduct(request);
        return ResponseEntity.ok(savedProduct);
    }
}

