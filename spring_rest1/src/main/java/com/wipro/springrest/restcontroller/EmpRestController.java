package com.wipro.springrest.restcontroller;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.springrest.entity.Employee;

@RestController
@RequestMapping("/api/employees")
public class EmpRestController {

	
			@GetMapping("/hello")
			public String  sayHello() {
				
				
				return "HELLO FRIENDS";
				
			}
			
			
			  @PostMapping("/add") public String addEmp(@RequestBody Employee emp) {
			  
			  
			  return "Employee  added "+emp;
			  
			  }
			 
			  @PutMapping("/update") public String updateEmp(@RequestBody Employee emp) {
			  
			  
			  return "Employee data upated";
			  
			  }
			  
			  @DeleteMapping("/delete/{eid}") // localhost:8080/api/employees/delete/101
			  public String deleteEmp(@PathVariable int eid) {
			  
			  
			  return "record deleted for eid "+ eid;
			  
			 
			  }
			 
			 
			
			
	
}