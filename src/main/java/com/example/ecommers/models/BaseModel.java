package com.example.ecommers.models;

import java.util.UUID;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public class BaseModel {
	
	    @Id
	    @GeneratedValue(generator = "generator_name")
	    @GenericGenerator(name = "generator_name", strategy = "uuid2")
	    @Column(name = "id", columnDefinition = "binary(16)", nullable = false, updatable = false)
	    private UUID id;

		public UUID getId() {
			return id;
		}

		public void setId(UUID id) {
			this.id = id;
		}
	    
	    

}
