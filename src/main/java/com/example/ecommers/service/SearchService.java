package com.example.ecommers.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.ecommers.dtos.GenericProductDto;
import com.example.ecommers.models.Product;
import com.example.ecommers.models.SortParam;
import com.example.ecommers.repository.ProductRepository;


@Service
public class SearchService {
	
	private ProductRepository productRepository;
	
	@Autowired
	public SearchService(ProductRepository productRepository){
		this.productRepository = productRepository;
	}
	
	public List<GenericProductDto> searchProducts(String query,int pageNumber, int pageSIze,
			List<SortParam> sortParams){
		
		 Sort sort = null;
	        if (sortParams.get(0).getSortType().equals("ASC")) {
	            sort = Sort.by(sortParams.get(0).getSortParamName()).ascending();
	        } else {
	            sort = Sort.by(sortParams.get(0).getSortParamName()).descending();
	        }
	        for (int i = 1; i < sortParams.size(); i++) {
	            if (sortParams.get(i).getSortType().equals("ASC")) {
	                sort.and(Sort.by(sortParams.get(i).getSortParamName())).ascending();
	            } else {
	                sort.and(Sort.by(sortParams.get(i).getSortParamName())).descending();
	            }
	        }
		
		PageRequest pageRequest = PageRequest.of(pageNumber, pageSIze,sort);
		List<Product> products = productRepository.findAllByTitleContainingIgnoreCase(query,pageRequest);
		List<GenericProductDto> genericProductDto = new ArrayList<>();
		
		for(Product product : products) {
			genericProductDto.add(product.from(product));
		}
		
		return genericProductDto;
		
	}

}
