package com.frontalx.springboot_crud_hibernate.repository;

import com.frontalx.springboot_crud_hibernate.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
