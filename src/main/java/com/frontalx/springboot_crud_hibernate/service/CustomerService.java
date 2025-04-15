package com.frontalx.springboot_crud_hibernate.service;

import com.frontalx.springboot_crud_hibernate.domain.Customer;
import com.frontalx.springboot_crud_hibernate.domain.Orders;

import java.util.List;

public interface CustomerService {

    List<Customer> getCustomers();

    Customer createCustomer(Customer customer);

    Orders createOrder(Orders orders, String customerId);
}
