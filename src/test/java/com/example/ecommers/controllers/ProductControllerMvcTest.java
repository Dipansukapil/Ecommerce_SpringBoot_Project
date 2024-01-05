package com.example.ecommers.controllers;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
//import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.awt.PageAttributes.MediaType;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.example.ecommers.Controller.ProductController;
import com.example.ecommers.dtos.GenericProductDto;
import com.example.ecommers.service.ProductService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


import jakarta.inject.Inject;

@WebMvcTest(ProductController.class)
public class ProductControllerMvcTest {
	
	@MockBean
	private ProductService productService;
	
	@Inject
	private MockMvc mockMvc;
	
	@Inject
	private ObjectMapper objectMapper;
	
	@Test
	void testGetAllProductsReturnsEmptyList() throws Exception {
	   when(productService.getAllProducts())
	        .thenReturn(new ArrayList<>());
	   
	   mockMvc.perform(get("/products"))
	          .andExpect(status().is(200))
	          .andExpect(content().string("[]"));
	   }
	
	 @Test
	 void testGetAllProductsReturnValidList() throws JsonProcessingException, Exception {
		 List<GenericProductDto> genericProductDtos = new ArrayList<>();
		 genericProductDtos.add(new GenericProductDto());
		 genericProductDtos.add(new GenericProductDto());
		 genericProductDtos.add(new GenericProductDto());
		 
		 when(productService.getAllProducts())
		     .thenReturn(genericProductDtos);
		 
		 mockMvc.perform(get("/products"))
		        .andExpect(status().is(200))
		        .andExpect(content().string(objectMapper.writeValueAsString(genericProductDtos)));
	 }
	 
	 @Test
	    void createProductShouldCreateAValidNewProduct() throws Exception {
	        GenericProductDto productToCreateDto = new GenericProductDto();
	        productToCreateDto.setTitle("Macbook");
	        productToCreateDto.setPrice(200000);
	        productToCreateDto.setDescription("Fastest mac ever");
	        productToCreateDto.setCategory("Laptop");

	        GenericProductDto outputGenericProductDto = new GenericProductDto();
	        outputGenericProductDto.setCategory(productToCreateDto.getCategory());
	        outputGenericProductDto.setTitle(productToCreateDto.getTitle());
	        outputGenericProductDto.setPrice(productToCreateDto.getPrice());
	        outputGenericProductDto.setDescription(productToCreateDto.getDescription());
	        

	        when(productService.createProduct(any()))
	                .thenReturn(outputGenericProductDto);

	        mockMvc.perform(post("/products")
	                
	                .content(objectMapper.writeValueAsString(productToCreateDto))
	        )
	                .andExpect(status().is(200))
	                .andExpect(
	                        content().string(objectMapper.writeValueAsString(outputGenericProductDto))
	                ).andExpect(jsonPath("$.title", is("Macbook")))
	                .andExpect(jsonPath("$.price", is(200000)));
	    }
	
	
	
	

}
