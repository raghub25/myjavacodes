//package com.springboot.practice.productservice;
//
//import com.springboot.practice.productservice.dto.ProductRequest;
//import com.springboot.practice.productservice.dto.ProductResponse;
//import com.springboot.practice.productservice.repository.ProductRepository;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.DynamicPropertyRegistry;
//import org.springframework.test.context.DynamicPropertySource;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//import org.testcontainers.containers.PostgreSQLContainer;
//import org.testcontainers.junit.jupiter.Container;
//import org.testcontainers.junit.jupiter.Testcontainers;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.testcontainers.utility.DockerImageName;
//
//import java.math.BigDecimal;
//
//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@SpringBootTest
//@Testcontainers
//@AutoConfigureMockMvc
//class ProductServiceApplicationTests {
//
//	@Container
//	static PostgreSQLContainer postgreSQLContainer = new PostgreSQLContainer(
//			DockerImageName.parse("postgres"))
//			.withDatabaseName("phone")
//			.withUsername("postgres")
//			.withPassword("password");
//	static {
//		postgreSQLContainer.start();
//	}
//	@Autowired
//	private MockMvc mockMvc;
//
//	@Autowired
//	private ObjectMapper objectMapper;
//
//	@Autowired
//	private ProductRepository productRepository;
//
//	@DynamicPropertySource
//	static void setProperties(DynamicPropertyRegistry dynamicPropertyRegistry) {
//		dynamicPropertyRegistry.add("spring.datasource.driver-class-name", postgreSQLContainer::getDriverClassName);
//		dynamicPropertyRegistry.add("spring.datasource.url", postgreSQLContainer::getJdbcUrl);
//		dynamicPropertyRegistry.add("spring.datasource.username", postgreSQLContainer::getUsername);
//		dynamicPropertyRegistry.add("spring.datasource.password", postgreSQLContainer::getPassword);
//	}
//
//	@Test
//	void testCreateProduct() throws Exception {
//		ProductRequest productRequest = getProductRequest();
//		String productRequestToString = objectMapper.writeValueAsString(productRequest);
//		mockMvc.perform(MockMvcRequestBuilders.post("/api/product/insertProduct")
//				.contentType(MediaType.APPLICATION_JSON)
//				.content(productRequestToString))
//				.andExpect(status().isCreated());
//        Assertions.assertEquals(1, productRepository.findAll().size());
//	}
//
//	@Test
//	void testGetProduct() throws Exception {
//		mockMvc.perform(MockMvcRequestBuilders.get("/api/product/getProduct")
//						.accept(MediaType.APPLICATION_JSON))
//				.andDo(print())
//				.andExpect(status().isOk())
//				.andExpect(MockMvcResultMatchers.jsonPath("$").isNotEmpty());
//	}
//
//	private ProductRequest getProductRequest() {
//		return ProductRequest.builder()
//				.name("SamsungS23")
//				.description("Samsung")
//				.price(BigDecimal.valueOf(1000000))
//				.build();
//	}
//
//}
