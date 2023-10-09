package com.springboot.practice.orderservice.repository;

import com.springboot.practice.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
