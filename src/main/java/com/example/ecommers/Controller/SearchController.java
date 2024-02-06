package com.example.ecommers.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecommers.dtos.GenericProductDto;
import com.example.ecommers.dtos.SearchRequestDto;
import com.example.ecommers.service.SearchService;

@RestController
@RequestMapping("/search")
public class SearchController {
	
	private SearchService searchService;
	
	@Autowired
	public SearchController(SearchService searchService){
		this.searchService = searchService;
	}
	
	@PostMapping
	public Page<GenericProductDto> searchProducts(@RequestBody SearchRequestDto requestDto){
		
		List<GenericProductDto> genericProductDtos = searchService.searchProducts(requestDto.getQuery()
				,requestDto.getPageNumber(),requestDto.getItemsPerPage(),requestDto.getSortParams());
		
		Page<GenericProductDto> genericProductDtoPage = new PageImpl<>(genericProductDtos);
		
		return genericProductDtoPage;
		
	}
	
	

}
