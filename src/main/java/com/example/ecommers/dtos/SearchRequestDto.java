package com.example.ecommers.dtos;

import java.util.List;

import com.example.ecommers.models.SortParam;

public class SearchRequestDto {
	
	private String query; //Title of the product
    private int pageNumber;
    private int itemsPerPage;
    private List<SortParam> sortParams;
    
	public String getQuery() {
		return query;
	}
	public void setQuery(String query) {
		this.query = query;
	}
	public int getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	public int getItemsPerPage() {
		return itemsPerPage;
	}
	public void setItemsPerPage(int itemsPerPage) {
		this.itemsPerPage = itemsPerPage;
	}
	public List<SortParam> getSortParams() {
		return sortParams;
	}
	public void setSortParams(List<SortParam> sortParams) {
		this.sortParams = sortParams;
	}
	
    
    

}
