package com.example.ecommers.service;

import java.util.ArrayList;
import java.util.List;

import java.util.Optional;
import org.springframework.stereotype.Service;

import com.example.ecommers.ThirdPartyClient.FakeStoreClient.FakeStoreClient;
import com.example.ecommers.dtos.FakeStoreProductDto;
import com.example.ecommers.dtos.GenericProductDto;
import com.example.ecommers.exception.ProductNotFoundException;
import com.example.ecommers.security.JWTObject;
import com.example.ecommers.security.TokenValidater;

@Service
public class FakeStoreProductService implements ProductService {
	
	 private FakeStoreClient fakeStoreClient;
	 private TokenValidater tokenValidater;

	    FakeStoreProductService(FakeStoreClient fakeStoreAdapter,
	    		TokenValidater tokenValidater){
	        this.fakeStoreClient = fakeStoreAdapter;
	        this.tokenValidater = tokenValidater;
	    }
	    //AutoWiring
//	    FakeStoreProductService(RestTemplateBuilder restTemplateBuilder){
//	        this.restTemplateBuilder = restTemplateBuilder;
//	    }

	    // Convert FakeStoreDto to GenericStoreDto before returning

	    private static GenericProductDto convertToGenericProductDto(FakeStoreProductDto fakeStoreProductDto){
	        GenericProductDto genericProductDto = new GenericProductDto();
	        genericProductDto.setImage(fakeStoreProductDto.getImage());
	        genericProductDto.setCategory(fakeStoreProductDto.getCategory());
	        genericProductDto.setDescription(fakeStoreProductDto.getDescription());
	        genericProductDto.setTitle(fakeStoreProductDto.getTitle());
	        genericProductDto.setPrice(fakeStoreProductDto.getPrice());

	        return genericProductDto;
	    }

	    @Override
	    public GenericProductDto getProductById(String authToken,Long id) throws ProductNotFoundException {
	        // Integrate FakeStore API.
	        // RestTemplate.
//	        RestTemplate restTemplate = restTemplateBuilder.build();
//	        ResponseEntity<FakeStoreProductDto> responseEntity =
//	                restTemplate.getForEntity(specificProductUrl, FakeStoreProductDto.class,id);
	//
//	        FakeStoreProductDto fakeStoreProductDto = responseEntity.getBody();
	//
//	        if(fakeStoreProductDto == null){
//	            throw new ProductNotFoundException("Product with id : "+id+" dosen't exist.");
//	        }
	//
//	        // Convert FakeStoreDto to GenericStoreDto before returning
//	        return convertToGenericProductDto(responseEntity.getBody());
	    	
	    	Optional<JWTObject> jwtObjectOptional = tokenValidater.validateToken(authToken);
	    	
	    	if(jwtObjectOptional.isEmpty()) {
	    		return null;
	    	}
	    	
	    	JWTObject jwtObject = jwtObjectOptional.get();
	        Long userId = jwtObject.getUserId();

	        return convertToGenericProductDto(fakeStoreClient.getProductById(id));
	    }

	    @Override
	    public List<GenericProductDto> getAllProducts() {

//	        RestTemplate restTemplate = restTemplateBuilder.build();
	//
//	        ResponseEntity<FakeStoreProductDto[]> responseEntity =
//	                restTemplate.getForEntity(genericProductUrl,FakeStoreProductDto[].class);
	//
//	        List<GenericProductDto> result = new ArrayList<>();
//	        List<FakeStoreProductDto> fakeStoreProductDtos = List.of(responseEntity.getBody());
//	        for(FakeStoreProductDto fakeStoreProductDto: fakeStoreProductDtos){
//	            result.add(convertToGenericProductDto(fakeStoreProductDto));
//	        }
	//
//	                return result;

	        List<FakeStoreProductDto> fakeStoreProductDtos =
	                fakeStoreClient.getAllProducts();

	        List<GenericProductDto> genericProductDtos = new ArrayList<>();
	        for(FakeStoreProductDto fakeStoreProductDto : fakeStoreProductDtos){
	               genericProductDtos.add(convertToGenericProductDto(fakeStoreProductDto));
	        }

	        return genericProductDtos;

	    }

	    @Override
	    public GenericProductDto deleteProductById(Long id) {

//	        RestTemplate restTemplate = restTemplateBuilder.build();
//	        RequestCallback requestCallback = restTemplate.acceptHeaderRequestCallback(FakeStoreProductDto.class);
//	        ResponseExtractor<ResponseEntity<FakeStoreProductDto>> responseExtractor =
//	                restTemplate.responseEntityExtractor(FakeStoreProductDto.class);
//	        ResponseEntity<FakeStoreProductDto> responseEntity =
//	                restTemplate.execute(specificProductUrl, HttpMethod.DELETE, requestCallback, responseExtractor, id);
	//
//	        return convertToGenericProductDto(responseEntity.getBody());

	        return convertToGenericProductDto(fakeStoreClient.deleteProductById(id));

	    }

	    @Override
	    public GenericProductDto createProduct(GenericProductDto genericProductDto) {

//	        RestTemplate restTemplate = restTemplateBuilder.build();
//	        ResponseEntity<FakeStoreProductDto> responseEntity =
//	                restTemplate.postForEntity(genericProductUrl,genericProductDto,FakeStoreProductDto.class);
	//
//	        return convertToGenericProductDto(responseEntity.getBody());

	        return convertToGenericProductDto(fakeStoreClient.createProduct(genericProductDto));
	    }

	    @Override
	    public GenericProductDto updateProductById(Long id,GenericProductDto genericProductDto) {

	        return null;

	    }
	
	

}
