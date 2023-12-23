package com.example.ecommers.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.ecommers.dtos.ExceptionDto;
import com.example.ecommers.exception.ProductNotFoundException;

@ControllerAdvice
public class ProductControllerAdvice {
	
	@ExceptionHandler(ProductNotFoundException.class)
//  @ResponseStatus(HttpStatus.NOT_FOUND)
//  @ResponseBody
  private ResponseEntity<ExceptionDto> handleProductNotFoundException(ProductNotFoundException productNotFoundException){

      ExceptionDto exceptionDto = new ExceptionDto();
      exceptionDto.setMessage(productNotFoundException.getMessage());
      exceptionDto.setHttpStatus(HttpStatus.NOT_FOUND);

//      return exceptionDto;

      return new ResponseEntity<>(exceptionDto,HttpStatus.NOT_FOUND);


  }

}
