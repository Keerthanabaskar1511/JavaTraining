package com.wipro.employee2.RestController;





import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.wipro.employee2.exception.EmployeeNotFoundException;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	
		@ExceptionHandler(EmployeeNotFoundException.class)
		public ResponseEntity<String>   handleExp(){
			
			
			return  new ResponseEntity<>("Employee Not Found ",HttpStatus.NOT_FOUND);
			
		} 
	
	

}
