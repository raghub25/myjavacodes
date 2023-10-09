package com.springboot.practice.productservice.dao;

import com.springboot.practice.productservice.model.Product;
import com.springboot.practice.productservice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ProductDao {
    private final ProductRepository productRepository;

    public void createProduct(Product product) {
        productRepository.save(product);
    }

    public List<Product> getProduct() {
        return productRepository.findAll();
    }
}
