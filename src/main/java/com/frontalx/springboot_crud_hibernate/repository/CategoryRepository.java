package com.frontalx.springboot_crud_hibernate.repository;

import com.frontalx.springboot_crud_hibernate.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Optional<Category> findByName(String name);
}
