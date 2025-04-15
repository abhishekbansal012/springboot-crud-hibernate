package com.frontalx.springboot_crud_hibernate.domain;

import lombok.Data;

import java.util.Set;

@Data
public class ProductRequest {
    private String name;
    private Double price;
    private Set<String> categoryNames; // List of category names to assign
}
