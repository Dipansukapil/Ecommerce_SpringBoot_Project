package com.example.ecommers.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "orders")
public class Order extends BaseModel {

    /*
         1              M
        Order ------- Product => M:M
          M              1
     */
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "products_orders",
            joinColumns = @JoinColumn(name = "order_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )
//    @JoinTable(
//  		  name = "users_roles",
//  		  joinColumns = @JoinColumn(
//  				  name = "user_id", referencedColumnName = "id"),
//  		          inverseJoinColumns = @JoinColumn(
//  		        		  name="role_id",referencedColumnName = "id"))
    private List<Product> products;

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
    
    
    
}
