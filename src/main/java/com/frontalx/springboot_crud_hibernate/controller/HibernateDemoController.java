package com.frontalx.springboot_crud_hibernate.controller;

import com.frontalx.springboot_crud_hibernate.domain.Customer;
import com.frontalx.springboot_crud_hibernate.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class HibernateDemoController {

    private final CustomerService customerService;

    @GetMapping("/customers")
    ResponseEntity<List<Customer>> getCustomerList() {
        return ResponseEntity.ok(customerService.getCustomers());
    }

    @PostMapping("/customers")
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
        Customer savedCustomer = customerService.createCustomer(customer);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedCustomer);
    }


}
