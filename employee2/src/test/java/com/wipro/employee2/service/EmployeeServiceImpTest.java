package com.wipro.employee2.service;



import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.wipro.employee2.dto.EmployeeDTO;
import com.wipro.employee2.entity.Employee;

@SpringBootTest
class EmployeeServiceImpTest {

    @Autowired
    IEmployeeService service;

    @Test
    @Disabled
    void testAddEmp() {
		
        EmployeeDTO dto1 = new EmployeeDTO(102,"Kirthi",25000);

        Employee emp1 = service.addEmp(dto1);

        assertNotNull(emp1);
        assertEquals("Kirthi", emp1.getEname());
    }

    @Test
    @Disabled
    void testGetAllEmployees() {
    	  List<Employee> list = service.getAllEmployees();
          assertNotNull(list);
    }

    @Test
    @Disabled
    void testUpdateEmp() {
    	 EmployeeDTO dto = new EmployeeDTO(1,"Updated",30000);

         Employee emp = service.updateEmp(dto);

         assertEquals("Updated", emp.getEname());
    }

    @Test
    void testGetById() {
    	Employee emp = service.getByEid(2);
        assertNotNull(emp);
    }

    @Test
    @Disabled
    void testDelete() {
    	   String msg = service.deleteByEid(101);
           assertTrue(msg.contains("deleted"));
        
    }
}
