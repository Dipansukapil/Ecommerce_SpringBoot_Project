package com.example.ecommers.security;

import java.util.Optional;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class TokenValidater {
	
	private RestTemplateBuilder  restTempelateBuilder;
	
	TokenValidater(RestTemplateBuilder  restTempelateBuilder){
		this.restTempelateBuilder = restTempelateBuilder;
	}
	
	/**
     * This method should call the UserService to validate the token.
     * If the token is valid then return the corresponding object else
     * return empty.
     * @param token
     * @return
     */
	
	public Optional<JWTObject> validateToken(String token){
		
		RestTemplate restTemplate = restTempelateBuilder.build();
		
		//Make an HTTP call to UserService to call the validateToken method.
		
		return Optional.empty();
	}

}
