package com.example.ecommers.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.ecommers.Controller.ProductController;
import com.example.ecommers.ThirdPartyClient.FakeStoreClient.FakeStoreClient;
import com.example.ecommers.dtos.GenericProductDto;
import com.example.ecommers.exception.ProductNotFoundException;
import com.example.ecommers.service.ProductService;

import jakarta.inject.Inject;

@SpringBootTest
public class ProductcontrollerTest {
	
	@Inject
	private ProductController productController;
	
	 @Inject
	 private FakeStoreClient fakeStoreClient;
	 
	 @MockBean
	  private ProductService productService;
	 
	 @Captor
	    private ArgumentCaptor<Long> argumentCaptor;
	
//	@Test
//	@DisplayName("Testing 1 plus 2")
//	void testoneplusoneistwo() {
//		assertEquals(3, 1+2,"1 plus 2 is 3");
//		assertTrue(1==1);
//		//Checks the expected value (2) vs the output of the expression.
//      //If assert is TRUE, test case succeeds, else fails.
//	}
	
//  @Test
//  void testGetProductByIdNegativeTC() throws ProductNotFoundException {
//      assertThrows(ProductNotFoundException.class, () -> productController.getProductById(10000L));
//      //assertNull(fakeStoreClient.getProductById(1000L));
//  }
  
//  @Test
//  void testGetProductByIdMocking() throws ProductNotFoundException {
//	  
//	  GenericProductDto genericProductDto = new GenericProductDto();
//	  
//	  when(productService.getProductById(10L)).thenReturn(genericProductDto);
//	  
//	  GenericProductDto genericProductDto2 = productController.getProductById(10L);
//	  
//	  assertEquals(genericProductDto, genericProductDto2);
//  }
//  
//  @Test
//  void testGetProductByIdMockingException() throws ProductNotFoundException {
//	  
//	  when(productService.getProductById(10L)).thenThrow(ProductNotFoundException.class);
//	  
//	  assertThrows(ProductNotFoundException.class, () -> productService.getProductById(10L));
//  }
//  
//  @Test
//  void testGetProductByIdForCustomLogic() throws ProductNotFoundException {
//	  
//	  GenericProductDto genericProductDto = new GenericProductDto();
//	  
//	  when(productService.getProductById(any(Long.class))).thenReturn(genericProductDto);
//	  
//	  GenericProductDto genericProductDto2 = productController.getProductById(12334L);
//	  
//	  assertEquals(genericProductDto, genericProductDto2);
//  }
//  
//  @Test
//@DisplayName("testProductControllerCallsProductServiceWithSameProductIdAsInput")
//void testIfSameInput() throws ProductNotFoundException {
//    //This is the test case to check if productController is passing the same productId to the
//    //productService as the input.
//    Long id = 100L;
//
//    when(productService.getProductById(id)).thenReturn(new GenericProductDto());
//
//    GenericProductDto genericProductDto =  productController.getProductById(id);
//
//    
//	verify(productService).getProductById(argumentCaptor.capture());
//
//    assertEquals(id, argumentCaptor.getValue());
//}
	

}
