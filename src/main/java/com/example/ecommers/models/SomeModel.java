package com.example.ecommers.models;

import jakarta.persistence.Entity;

@Entity
public class SomeModel extends BaseModel {
    private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
    
}
