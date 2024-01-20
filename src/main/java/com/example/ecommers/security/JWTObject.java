package com.example.ecommers.security;

import java.util.Date;
import java.util.List;

import com.userservice.models.Role;

public class JWTObject {
	
	private String email;
	private String userId;
	private Date expiryAt;
	private Date createdAt;
	private List<Role> roles;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Date getExpiryAt() {
		return expiryAt;
	}
	public void setExpiryAt(Date expiryAt) {
		this.expiryAt = expiryAt;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public List<Role> getRoles() {
		return roles;
	}
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	
	

}
