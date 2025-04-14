package com.frontalx.springboot_crud_hibernate.repository;

import com.frontalx.springboot_crud_hibernate.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    // Optional: add custom query methods
    Customer findByEmail(String email);
}