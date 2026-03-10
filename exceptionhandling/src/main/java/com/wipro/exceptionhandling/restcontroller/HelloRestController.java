package com.wipro.exceptionhandling.restcontroller;

import org.springframework.boot.servlet.autoconfigure.ServletEncodingProperties.HttpMessageType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloRestController {
	
		@GetMapping("/hello")
		public String  sayHello() {
			
				
				
				String upperName = null;
			
			return "Hello "+upperName.toUpperCase();
			
		}
		
		@GetMapping("/div/{n1}/{n2}")
		public  String   div(@PathVariable int n1 , @PathVariable  int n2) {
			
			
				int result = n1 /n2;  // arithmetic exp
				
				
			return "Result is : "+result;
		
			
		}
		
		
		/*
		 * @ExceptionHandler(ArithmeticException.class) public ResponseEntity<String>
		 * handleExp() {
		 * 
		 * return new ResponseEntity<String>(new
		 * String("Sorry! You cannot divide num by zero"), HttpStatus.NOT_ACCEPTABLE );
		 * 
		 * }
		 * 
		 * 
		 * @ExceptionHandler(NullPointerException.class)
		 * 
		 * @ResponseStatus(reason = "Sorry You got Null Pointer Exp" , value =
		 * HttpStatus.NOT_FOUND) public void handleNPExp() {
		 * 
		 * }
		 */
		
		
		
		
	
	

}