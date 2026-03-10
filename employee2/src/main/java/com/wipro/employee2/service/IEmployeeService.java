package com.wipro.employee2.service;





import java.util.List;

import com.wipro.employee2.dto.EmployeeDTO;
import com.wipro.employee2.entity.Employee;

public interface IEmployeeService {
	
	
		public  Employee   addEmp(EmployeeDTO emp);
		public  Employee   updateEmp(EmployeeDTO emp);
		
		public  List<Employee>    getAllEmployees();
		
		public   Employee   getByEid(int eid);
		public    String    deleteByEid(int eid);

}