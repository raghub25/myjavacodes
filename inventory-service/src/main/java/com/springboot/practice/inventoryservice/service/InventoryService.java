package com.springboot.practice.inventoryservice.service;

import com.springboot.practice.inventoryservice.dao.InventoryDao;
import com.springboot.practice.inventoryservice.dto.InventoryRequest;
import com.springboot.practice.inventoryservice.dto.InventoryResponse;
import com.springboot.practice.inventoryservice.model.Inventory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class InventoryService {
    private final InventoryDao inventoryDao;

    public List<InventoryResponse> getInventoryItems(List<String> skuCodes) {
        return inventoryDao.getInventoryItems(skuCodes);
    }

    public void addInventoryItems(InventoryRequest request) {
        Inventory inventoryItem = getInventoryItem(request.getSkuCode());
        Inventory inventory = Inventory.builder()
                .id(request.getId())
                .quantity(inventoryItem == null ? 1 : inventoryItem.getQuantity() + 1)
                .skuCode(request.getSkuCode())
                .build();
        inventoryDao.addInventoryItems(inventory);
    }

    private Inventory getInventoryItem(String skuCode) {
        return inventoryDao.getInventoryItem(skuCode);
    }
}
