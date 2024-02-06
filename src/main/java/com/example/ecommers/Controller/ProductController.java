package com.example.ecommers.Controller;

import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecommers.dtos.GenericProductDto;
import com.example.ecommers.exception.ProductNotFoundException;
import com.example.ecommers.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	private ProductService productService;

    ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public GenericProductDto getProductById(@RequestHeader(HttpHeaders.AUTHORIZATION) String authToken,
    		@PathVariable("id") Long id) throws ProductNotFoundException {
    	//System.out.print(authToken);
        return productService.getProductById(authToken,id);
    }

    @GetMapping
    public List<GenericProductDto> getAllProduct(){
        return productService.getAllProducts();
    }

    @DeleteMapping("/{id}")
    public GenericProductDto deleteProductById(@PathVariable("id") Long id){
        return productService.deleteProductById(id);

    }

    @PostMapping
    public GenericProductDto createProduct(@RequestBody GenericProductDto genericProductDto){
       return productService.createProduct(genericProductDto);
    }

    @PutMapping({"id"})
    public GenericProductDto updateProductById(@PathVariable("id") Long id,@RequestBody GenericProductDto genericProductDto){
        return productService.updateProductById(id,genericProductDto);

    }

}
