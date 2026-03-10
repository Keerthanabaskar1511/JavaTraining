package com.wipro.exceptionhandling.restcontroller;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(ArithmeticException.class)
	public   ResponseEntity<String>    handleExp() {
		
		return	 new ResponseEntity<String>(new String("Sorry! You cannot divide num by zero"), HttpStatus.NOT_ACCEPTABLE );
		
	}
	
	
	
	@ExceptionHandler(Exception.class)
	public   ResponseEntity<String>    handleExp2() {
		
		return	 new ResponseEntity<String>(new String("Sorry! Some Exception Occur"), HttpStatus.NOT_ACCEPTABLE );
		
	}
	

}