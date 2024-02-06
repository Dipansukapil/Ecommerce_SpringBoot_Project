package com.example.ecommers;

import java.util.List;
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
public class ProductService implements CommandLineRunner {

//	 private final PriceRepository priceRepository;
//	 private final CategoryRepository categoryRepository;
//	 private final ProductRepository productRepository;
//	 
//	 ProductService(PriceRepository priceRepository,
//			             CategoryRepository categoryRepository,
//			             ProductRepository productRepository){
//		 this.priceRepository = priceRepository;
//		 this.categoryRepository = categoryRepository;
//		 this.productRepository = productRepository;
//	 }

	public static void main(String[] args) {
		SpringApplication.run(ProductService.class, args);
		
	}
	

	@Override
	public void run(String... args) throws Exception {
		
//      Category category = new Category();
//      category.setName("Apple Devices");
//
//      Category savedCategory = categoryRepository.save(category);
//
//
//      Optional<Category> optionalCategory = categoryRepository.findById(UUID.fromString("f41ebf01-5cc5-4f4c-a8aa-6dcd149e481d"));
//      if (optionalCategory.isEmpty()) {
//          throw new Exception("Category was null");
//      }
//
//      Category category1 = optionalCategory.get();
//      Product product = new Product();
//      product.setTitle("iPhone 15 pro");
//      product.setDescription("Best iPhone ever");
//      product.setCategory(savedCategory);
//
//      Product savedProduct = productRepository.save(product);
//
//
//      //Find all the products with category = Apple Devices.
//      List<Product> products = category.getProducts();
//      for (Product product1 : products) {
//          System.out.println(product1.getTitle());
//      }
//
//      Price price = new Price();
//      price.setCurrency("INR");
//      price.setValue(100000);
      //Price savedPrice = priceRepository.save(price);

//      Category category2 = new Category();
//      category2.setName("Apple Devices");
//      Category savedCategoy = categoryRepository.save(category2);
//
//      Product product1 = new Product();
//      product1.setTitle("iPhone 15 pro");
//      product1.setDescription("Best iPhone ever");
//      product1.setCategory(savedCategoy);
//      product1.setPrice(price);
//
//      Product savedProduct1 = productRepository.save(product);
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
