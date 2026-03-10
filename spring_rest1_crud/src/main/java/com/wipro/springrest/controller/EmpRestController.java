package com.wipro.springrest.controller;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.springrest.dto.EmployeeDTO;
import com.wipro.sprinrestcrud.entity.Employee;
import com.wipro.springrestcrud.service.IEmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmpRestController {
	
			@Autowired
			IEmployeeService service;
	
	
		@PostMapping("/add")
		public  Employee     addEmp(@RequestBody  EmployeeDTO emp) {
			
			 	return service.addEmp(emp);
			
			
		}
		
		@PutMapping("/update")
		public  Employee     updateEmp(@RequestBody  EmployeeDTO emp) {
			
			 	return service.updateEmp(emp);
			
			
		}
		
		
		
		@GetMapping("/getall")
		public List<Employee>  getAllEmployees(){
			
			
			return   service.getAllEmployees();
			
		}
		
		
		@GetMapping("/getbyid/{eid}")
		public  Employee  getByEid(@PathVariable int eid) {
			
			
			return service.getByEid(eid);
		}
		
		@DeleteMapping("/deletebyid/{eid}")
		public String deleteByEid(@PathVariable int eid) {
			
			   return service.deleteByEid(eid);
			
		}
		
		
		
		

}
