package com.springboot.practice.orderservice.service;

import com.springboot.practice.orderservice.dao.OrderDao;
import com.springboot.practice.orderservice.dto.InventoryResponse;
import com.springboot.practice.orderservice.dto.OrderLineItemsRequest;
import com.springboot.practice.orderservice.dto.OrderRequest;
import com.springboot.practice.orderservice.model.Order;
import com.springboot.practice.orderservice.model.OrderLineItems;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Transactional
public class OrderService {
    private final OrderDao orderDao;
    private final WebClient webClient;
    public void placeOrder(OrderRequest orderRequest) {
        List<OrderLineItems> orderLineItems = orderRequest.getOrderLineItemsRequestList()
                .stream()
                .map(this::getOrderLineItems)
                .toList();
        Order order = Order.builder()
                .orderNumber(UUID.randomUUID().toString())
                .orderLineItemsList(orderLineItems)
                .build();

        List<String> skuCodes = order.getOrderLineItemsList().stream()
                .map(OrderLineItems::getSkuCode).toList();

        InventoryResponse[] inventoryResponses = webClient.get()
                .uri("http://localhost:8082/api/inventory"
                , uriBuilder -> uriBuilder.queryParam("skuCode", skuCodes).build())
                .retrieve()
                .bodyToMono(InventoryResponse[].class)
                .block();


        boolean allItemsInStock = false;
        if (inventoryResponses != null) {
            allItemsInStock = Arrays.stream(inventoryResponses).allMatch(InventoryResponse::isInStock);
        }

        if (allItemsInStock) {
            orderDao.placeOrder(order);
        }
        else {
            throw new IllegalArgumentException("Item is not in stock. Try again later.");
        }
    }

    private OrderLineItems getOrderLineItems(OrderLineItemsRequest orderLineItemsRequest) {
        return OrderLineItems.builder()
                .id(orderLineItemsRequest.getId())
                .skuCode(orderLineItemsRequest.getSkuCode())
                .price(orderLineItemsRequest.getPrice())
                .quantity(orderLineItemsRequest.getQuantity())
                .build();
    }
}
