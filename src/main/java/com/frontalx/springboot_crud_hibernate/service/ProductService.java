package com.frontalx.springboot_crud_hibernate.service;

import com.frontalx.springboot_crud_hibernate.domain.Category;
import com.frontalx.springboot_crud_hibernate.domain.Product;
import com.frontalx.springboot_crud_hibernate.domain.ProductRequest;
import com.frontalx.springboot_crud_hibernate.repository.CategoryRepository;
import com.frontalx.springboot_crud_hibernate.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepo;
    private final CategoryRepository categoryRepo;

    public Product addProduct(ProductRequest request) {
        Product product = new Product();
        product.setName(request.getName());
        product.setPrice(request.getPrice());

        Set<Category> categorySet = request.getCategoryNames().stream()
                .map(name -> categoryRepo.findByName(name)
                        .orElseGet(() -> categoryRepo.save(new Category(name))))
                .collect(Collectors.toSet());

        product.setCategories(categorySet);
        return productRepo.save(product);
    }
}

