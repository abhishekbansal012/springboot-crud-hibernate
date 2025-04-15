package com.frontalx.springboot_crud_hibernate.domain;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orders")
public class Orders {

    @Id
    @GeneratedValue
    private Long orderId;

    @Column
    private List<String> items;

    // Many orders belong to one customer
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id")  // This creates the foreign key
    Customer customer;

}
