package com.example.ecommers.models;

import com.example.ecommers.dtos.GenericProductDto;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Product extends BaseModel {
    private String title;
    private String description;
    private String image;

    //Category isn't a primitive attribute, it's a relation.
    //category_id in the product table.
    @ManyToOne(optional = false)
    private Category category;

    @OneToOne(cascade = {CascadeType.REMOVE, CascadeType.PERSIST})
    private Price price;
    private int inventoryCount;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Price getPrice() {
		return price;
	}
	public void setPrice(Price price) {
		this.price = price;
	}
	public int getInventoryCount() {
		return inventoryCount;
	}
	public void setInventoryCount(int inventoryCount) {
		this.inventoryCount = inventoryCount;
	}
	
	public GenericProductDto from(Product product) {
		GenericProductDto genericProductDto = new GenericProductDto();
		genericProductDto.setTitle(product.getTitle());
		genericProductDto.setDescription(product.getDescription());
		genericProductDto.setImage(product.getImage());
		
		
		return genericProductDto;
	}
    
    
}
