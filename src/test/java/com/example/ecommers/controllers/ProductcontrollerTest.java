package com.example.ecommers.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.ecommers.Controller.ProductController;
import com.example.ecommers.ThirdPartyClient.FakeStoreClient.FakeStoreClient;
import com.example.ecommers.exception.ProductNotFoundException;

import jakarta.inject.Inject;

@SpringBootTest
public class ProductcontrollerTest {
	
	@Inject
	private ProductController productController;
	
	 @Inject
	 private FakeStoreClient fakeStoreClient;
	
//	@Test
//	@DisplayName("Testing 1 plus 2")
//	void testoneplusoneistwo() {
//		assertEquals(3, 1+2,"1 plus 2 is 3");
//		assertTrue(1==1);
//		//Checks the expected value (2) vs the output of the expression.
//      //If assert is TRUE, test case succeeds, else fails.
//	}
	
  @Test
  void testGetProductByIdNegativeTC() throws ProductNotFoundException {
      //assertThrows(ProductNotFoundException.class, () -> productController.getProductById(10000L));
      assertNull(fakeStoreClient.getProductById(1000L));
  }
	

}
