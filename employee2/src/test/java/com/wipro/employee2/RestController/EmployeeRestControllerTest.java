package com.wipro.employee2.RestController;



import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.wipro.employee2.entity.Employee;
import com.wipro.employee2.dto.EmployeeDTO;




@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class EmployeeRestControllerTest {

	@Autowired
	RestTemplate restTemplate;
	
	@Test
	void testAddEmp() {
		Employee requestBody=new Employee(104,"Ravi",85000);
		
		
		ResponseEntity<Employee> response=restTemplate.postForEntity("http://localhost:8080/api/employees/add", requestBody, Employee.class);
		Employee emp=response.getBody();
		assertEquals(104,emp.getEid());
	}
	@Test
	@Disabled
	void  testAddEmp2() {
		
		 EmployeeDTO  requestBody = new EmployeeDTO(105, "Vijay", 8000);
		
		 
		Employee emp = 	restTemplate.postForObject("http://localhost:8080/api/employees/add", requestBody, Employee.class);
		
		assertTrue(emp.getEid() > 0);
		
	}

	@Test
	@Disabled
	void testUpdateEmp() {
		 EmployeeDTO  requestBody = new EmployeeDTO(105, "Vijay Kumar", 15000);
			
			restTemplate.put("http://localhost:8080/api/employees/update", requestBody);

	}

	@Test
	void testGetByEid() {
		int eid = 105;
		
		
		ResponseEntity<Employee> response =		restTemplate.getForEntity("http://localhost:8080/api/employees/getbyid/"+eid, Employee.class);
		
		
			Employee emp =	response.getBody();
			
			assertEquals(15000, emp.getSalary());
	}

	@Test
	void testDeleteByEid() {
		
	}

}
