package com.example.ecommers;

import java.util.Optional;
import java.util.UUID;

import org.hibernate.type.descriptor.java.PrimitiveCharacterArrayJavaType;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.ecommers.models.Category;
import com.example.ecommers.models.Price;
import com.example.ecommers.models.Product;
import com.example.ecommers.repository.CategoryRepository;
import com.example.ecommers.repository.PriceRepository;
import com.example.ecommers.repository.ProductRepository;

@SpringBootApplication
public class EcommersApplication implements CommandLineRunner {
//	
//	 private PriceRepository priceRepository;
//	 private CategoryRepository categoryRepository;
//	 private ProductRepository productRepository;
//	 
//	 EcommersApplication(PriceRepository priceRepository,
//			             CategoryRepository categoryRepository,
//			             ProductRepository productRepository){
//		 this.priceRepository = priceRepository;
//		 this.categoryRepository = categoryRepository;
//		 this.productRepository = productRepository;
//	 }

	public static void main(String[] args) {
		SpringApplication.run(EcommersApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
//		Category category = new Category();
//		category.setName("Apple Device");
//		Category savedCategory = categoryRepository.save(category);
//		
//		Price price = new Price();
//		price.setCurrency("INR");
//		price.setValue(100000);
//		Price savedPrice = priceRepository.save(price);
//	
//		
//		
//		Product product = new Product();
//		product.setTitle("iPhone 15 pro");
//		product.setDescription("Best iPhone ever");
//		product.setPrice(savedPrice);
//		product.setCategory(savedCategory);
//		
//		Product savedProduct = productRepository.save(product);
		
//	   Category category = new Category();
//       category.setName("Apple Devices");
//
//       Category savedCategory = categoryRepository.save(category);
//       
//       Product product = new Product();
//       product.setTitle("iPhone 15 pro");
//       product.setDescription("Best iPhone ever");
//       product.setCategory(category);
//
//       Product savedProduct = productRepository.save(product);
//       
//       Price price = new Price();
//       price.setCurrency("INR");
//       price.setValue(100000);
//       Price savedPrice = priceRepository.save(price);

		
		
	}

}
