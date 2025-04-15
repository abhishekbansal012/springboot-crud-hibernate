package com.frontalx.springboot_crud_hibernate.repository;

import com.frontalx.springboot_crud_hibernate.domain.Customer;
import com.frontalx.springboot_crud_hibernate.domain.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Long> {

}