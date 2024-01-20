package com.example.ecommers.security;

import jakarta.persistence.Entity;

@Entity
public class Roles extends BaseModel {
	
	 private String role;

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	 
	 

}
