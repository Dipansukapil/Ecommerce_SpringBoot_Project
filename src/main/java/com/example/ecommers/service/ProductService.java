package com.example.ecommers.service;

import java.util.List;

import com.example.ecommers.dtos.GenericProductDto;
import com.example.ecommers.exception.ProductNotFoundException;

public interface ProductService {
	
	
    List<GenericProductDto> getAllProducts();
    GenericProductDto deleteProductById(Long id);
    GenericProductDto createProduct(GenericProductDto genericProductDto);
    GenericProductDto updateProductById(Long id,GenericProductDto genericProductDto);
	GenericProductDto getProductById(String authToken, Long id) throws ProductNotFoundException;

}
