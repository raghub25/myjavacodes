package com.springboot.practice.inventoryservice.service;

import com.springboot.practice.inventoryservice.dao.InventoryDao;
import com.springboot.practice.inventoryservice.dto.InventoryResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InventoryService {
    private final InventoryDao inventoryDao;
    @Transactional(readOnly = true)
    public List<InventoryResponse> getInventoryItems(List<String> skuCodes) {
        return inventoryDao.getInventoryItems(skuCodes);
    }
}
