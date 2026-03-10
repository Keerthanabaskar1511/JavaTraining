package com.exampe.data.service;


import java.util.List;

import com.example.data.dto.EmployeeDTO;
import com.example.data.entity.Employee;

public interface IEmployeeService {
	
	
		public  Employee   addEmp(EmployeeDTO emp);
		public  Employee   updateEmp(EmployeeDTO emp);
		
		public  List<Employee>    getAllEmployees();
		
		public   Employee   getByEid(int eid);
		public    String    deleteByEid(int eid);
		
		
		
		public  Employee   getByEname(String ename);
		
		public List<Employee>  getBySalaryGT(double salary);
		
		
		public List<Employee>  getAllSorted();  
		
		public List<Employee>  getAllSortedByRange(double low , double high);
		
		public  double  getSumOfSal();
		
		
		public List<Employee>  getAllByNative();
		
		
		

}
