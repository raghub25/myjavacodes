package com.springboot.practice.productservice.controller;

import com.springboot.practice.productservice.dto.ProductRequest;
import com.springboot.practice.productservice.dto.ProductResponse;
import com.springboot.practice.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping("insertProduct")
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest productRequest) {
        productService.createProduct(productRequest);
    }

    @GetMapping("getProduct")
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getProduct() {
        return productService.getProduct();
    }
}
