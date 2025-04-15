package com.frontalx.springboot_crud_hibernate.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "categories") //The mappedBy side just references the other side and doesn’t manage the relationship.
    private Set<Product> products = new HashSet<>();


    public Category(String name) {
        this.name = name;
    }
}
