package com.springboot.practice.orderservice.dao;

import com.springboot.practice.orderservice.model.Order;
import com.springboot.practice.orderservice.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class OrderDao {
    private final OrderRepository orderRepository;

    public void placeOrder(Order order) {
        orderRepository.save(order);
    }
}
