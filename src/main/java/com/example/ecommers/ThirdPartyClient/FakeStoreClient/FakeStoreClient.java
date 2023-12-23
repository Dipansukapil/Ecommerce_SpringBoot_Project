package com.example.ecommers.ThirdPartyClient.FakeStoreClient;

import java.util.List;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RequestCallback;
import org.springframework.web.client.ResponseExtractor;
import org.springframework.web.client.RestTemplate;

import com.example.ecommers.dtos.FakeStoreProductDto;
import com.example.ecommers.dtos.GenericProductDto;
import com.example.ecommers.exception.ProductNotFoundException;

@Component
public class FakeStoreClient {
	
	private RestTemplateBuilder restTemplateBuilder;
	
	public FakeStoreClient(RestTemplateBuilder restTemplateBuilder) {
		
		this.restTemplateBuilder = restTemplateBuilder;
		
	}
	
	 private String specificProductUrl = "https://fakestoreapi.com/products/{id}";
	 private String genericProductUrl = "https://fakestoreapi.com/products";
	 
	 
	  public FakeStoreProductDto getProductById(Long id) throws ProductNotFoundException{
	        // Integrate FakeStore API.
	        // RestTemplate.
	        RestTemplate restTemplate = restTemplateBuilder.build();
	        ResponseEntity<FakeStoreProductDto> responseEntity =
	                restTemplate.getForEntity(specificProductUrl, FakeStoreProductDto.class,id);

	        FakeStoreProductDto fakeStoreProductDto = responseEntity.getBody();

	        if(fakeStoreProductDto == null){
	            throw new ProductNotFoundException("Product with id : "+id+" dosen't exist.");
	        }

	        // Convert FakeStoreDto to GenericStoreDto before returning
	        return fakeStoreProductDto;
	    }


	    public List<FakeStoreProductDto> getAllProducts() {

	        RestTemplate restTemplate = restTemplateBuilder.build();

	        ResponseEntity<FakeStoreProductDto[]> responseEntity =
	                restTemplate.getForEntity(genericProductUrl,FakeStoreProductDto[].class);

	       return List.of(responseEntity.getBody());

	    }


	    public FakeStoreProductDto deleteProductById(Long id) {

	        RestTemplate restTemplate = restTemplateBuilder.build();
	        RequestCallback requestCallback = restTemplate.acceptHeaderRequestCallback(FakeStoreProductDto.class);
	        ResponseExtractor<ResponseEntity<FakeStoreProductDto>> responseExtractor =
	                restTemplate.responseEntityExtractor(FakeStoreProductDto.class);
	        ResponseEntity<FakeStoreProductDto> responseEntity =
	                restTemplate.execute(specificProductUrl, HttpMethod.DELETE, requestCallback, responseExtractor, id);

	        return responseEntity.getBody();

	    }


	    public FakeStoreProductDto createProduct(GenericProductDto genericProductDto) {

	        RestTemplate restTemplate = restTemplateBuilder.build();
	        ResponseEntity<FakeStoreProductDto> responseEntity =
	                restTemplate.postForEntity(genericProductUrl,genericProductDto,FakeStoreProductDto.class);

	        return responseEntity.getBody();
	    }


	    public FakeStoreProductDto updateProductById(Long id,GenericProductDto genericProductDto) {


//	        RestTemplate restTemplate = restTemplateBuilder.build();
//	        RequestCallback requestCallback = restTemplate.acceptHeaderRequestCallback(FakeStoreProductDto.class);
//	        ResponseExtractor<ResponseEntity<FakeStoreProductDto>> responseExtractor =
//	                restTemplate.responseEntityExtractor(FakeStoreProductDto.class);
//	        restTemplate.execute(specificProductUrl, HttpMethod.DELETE, requestCallback, responseExtractor, id);
	//
//	        ResponseEntity<FakeStoreProductDto> responseEntity =
//	                restTemplate.postForEntity(specificProductUrl,genericProductDto,FakeStoreProductDto.class);
	//
//	        return responseEntity.getBody();


//
//	        RestTemplate restTemplate = restTemplateBuilder.build();
//	        ResponseEntity<FakeStoreProductDto> responseEntity =
//	        restTemplate.exchange(genericProductUrl,HttpMethod.PUT,new HttpEntity<>(genericProductDto),FakeStoreProductDto.class);
//
//
//
//	        return responseEntity.getBody();
	    	
	    	
	    	return null;



	    }

}
