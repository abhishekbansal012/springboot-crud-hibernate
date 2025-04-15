package com.frontalx.springboot_crud_hibernate.service.impl;

import com.frontalx.springboot_crud_hibernate.domain.Customer;
import com.frontalx.springboot_crud_hibernate.domain.Orders;
import com.frontalx.springboot_crud_hibernate.repository.CustomerRepository;
import com.frontalx.springboot_crud_hibernate.repository.OrdersRepository;
import com.frontalx.springboot_crud_hibernate.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {


    private final CustomerRepository customerRepository;

    private final OrdersRepository ordersRepository;

    @Override
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Orders createOrder(Orders orders, String customerId) {
        Optional<Customer> customer = customerRepository.findById(Long.valueOf(customerId));
        if(customer.isEmpty()) {
            throw new RuntimeException("Customer Not found");
        }
        customer.ifPresent(orders::setCustomer);
        return ordersRepository.save(orders);
    }
}
