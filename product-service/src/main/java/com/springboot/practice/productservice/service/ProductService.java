package com.springboot.practice.productservice.service;

import com.springboot.practice.productservice.dao.ProductDao;
import com.springboot.practice.productservice.dto.ProductRequest;
import com.springboot.practice.productservice.dto.ProductResponse;
import com.springboot.practice.productservice.model.Product;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {
    private final ProductDao productDao;

    public void createProduct(ProductRequest productRequest) {
        Product product = Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();
        productDao.createProduct(product);
        log.info("Product {} is saved", product.getId());
    }

    public List<ProductResponse> getProduct() {
        List<Product> products = productDao.getProduct();
        return products.stream().map(this :: mapToResponse).toList();
    }

    private ProductResponse mapToResponse(Product product) {
        return ProductResponse.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .build();
    }
}
