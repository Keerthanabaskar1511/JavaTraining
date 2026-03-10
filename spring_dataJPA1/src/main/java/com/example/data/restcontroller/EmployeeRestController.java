package com.example.data.restcontroller;


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

import com.example.data.dto.EmployeeDTO;
import com.example.data.entity.Employee;
import com.example.data.service.IEmployeeService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/employees")
public class EmployeeRestController {
	
			@Autowired
			IEmployeeService service;
	
	
		@PostMapping("/add")
		public  Employee     addEmp(@RequestBody  @Valid  EmployeeDTO emp) {
			
			
			
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
		public String   deleteByEid(@PathVariable int eid) {
			
			   return service.deleteByEid(eid);
			
		}
		
		
		@GetMapping("/getbyename/{ename}")
		public  Employee   getByEname( @PathVariable String ename) {
			
			return  service.getByEname(ename);
			
		}
		
		@GetMapping("/getbysalarygt/{salary}")
		public List<Employee>  getBySalaryGT(@PathVariable double salary){
			
			return service.getBySalaryGT(salary);
			
		}
		
		
		

		@GetMapping("/getallsorted")
		public List<Employee>  getAllSorted(){
			
			
			return   service.getAllSorted();
			
		}
		
		
		@GetMapping("/getallsortedbyrange/{low}/{high}")
		public List<Employee>  getAllSortedByRange( @PathVariable double low , @PathVariable double high){
			
			return service.getAllSortedByRange(low, high);
		}
		
		
		@GetMapping("/getSumOfSal")
		public  double  getSumOfSal() {
			
			
			return service.getSumOfSal();
		}
		
		
		@GetMapping("/getallbynative")
		public List<Employee>  getAllByNative(){
			
			return service.getAllByNative();
		}
		
		
		

}
