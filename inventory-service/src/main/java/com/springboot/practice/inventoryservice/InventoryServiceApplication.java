package com.springboot.practice.inventoryservice;

import com.springboot.practice.inventoryservice.model.Inventory;
import com.springboot.practice.inventoryservice.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(InventoryServiceApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner loadData(InventoryRepository inventoryRepository) {
//		return args -> {
//			Inventory inventory = new Inventory();
//			inventory.setQuantity(1);
//			inventory.setSkuCode("Samsung");
//
//			Inventory inventory1 = new Inventory();
//			inventory1.setQuantity(2);
//			inventory1.setSkuCode("Redmi");
//
//			inventoryRepository.save(inventory);
//			inventoryRepository.save(inventory1);
//		};
//	}

}
