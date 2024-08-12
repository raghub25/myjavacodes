package com.springboot.practice.inventoryservice.controller;

import com.springboot.practice.inventoryservice.dto.InventoryRequest;
import com.springboot.practice.inventoryservice.dto.InventoryResponse;
import com.springboot.practice.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<InventoryResponse> getInventoryItems(@RequestParam List<String> skuCode) {
        return inventoryService.getInventoryItems(skuCode);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addInventoryItems(@RequestBody InventoryRequest request) {
        inventoryService.addInventoryItems(request);
    }
}
