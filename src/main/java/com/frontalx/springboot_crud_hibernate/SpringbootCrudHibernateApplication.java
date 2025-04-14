package com.frontalx.springboot_crud_hibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.frontalx.springboot_crud_hibernate.domain")
public class SpringbootCrudHibernateApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringbootCrudHibernateApplication.class, args);

	}

}
