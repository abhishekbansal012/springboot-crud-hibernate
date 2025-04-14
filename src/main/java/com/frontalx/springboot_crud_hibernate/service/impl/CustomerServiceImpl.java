package com.frontalx.springboot_crud_hibernate.service.impl;

import com.frontalx.springboot_crud_hibernate.domain.Customer;
import com.frontalx.springboot_crud_hibernate.repository.CustomerRepository;
import com.frontalx.springboot_crud_hibernate.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {


    private final CustomerRepository customerRepository;

    @Override
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}
