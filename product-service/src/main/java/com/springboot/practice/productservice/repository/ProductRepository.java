package com.springboot.practice.productservice.repository;

import com.springboot.practice.productservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
