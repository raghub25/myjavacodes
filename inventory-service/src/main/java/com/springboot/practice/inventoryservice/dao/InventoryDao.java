package com.springboot.practice.inventoryservice.dao;

import com.springboot.practice.inventoryservice.dto.InventoryResponse;
import com.springboot.practice.inventoryservice.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class InventoryDao {
    private final InventoryRepository inventoryRepository;

    public List<InventoryResponse> getInventoryItems(List<String> skuCodes) {
        return inventoryRepository.findBySkuCodeIn(skuCodes)
                .stream().map(inventory -> InventoryResponse.builder()
                        .skuCode(inventory.getSkuCode())
                        .isInStock(inventory.getQuantity() > 0)
                        .build()).toList();
    }
}
