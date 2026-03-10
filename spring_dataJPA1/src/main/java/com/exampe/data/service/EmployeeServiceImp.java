package com.exampe.data.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.example.data.dto.EmployeeDTO;
import com.example.data.entity.Employee;
import com.example.data.repository.EmployeeRepository;

@Service
public class EmployeeServiceImp implements IEmployeeService {
	
	@Autowired
	EmployeeRepository repo;

	
	@Override
	public Employee addEmp(EmployeeDTO dto) {
		
		
		Employee emp = new Employee();
		
					
					emp.setEname(dto.getEname());
					emp.setSalary(dto.getSalary());
		
			
		return  repo.save(emp);
	}

	@Override
	public List<Employee> getAllEmployees() {


		return   repo.findAll();
	}

	@Override
	public Employee updateEmp(EmployeeDTO dto) {
		
		
		Employee emp = new Employee();
		
		emp.setEid(dto.getEid());
		emp.setEname(dto.getEname());
		emp.setSalary(dto.getSalary());

		
		
		return repo.save(emp);
	}

	@Override
	public Employee getByEid(int eid) {


		
		return repo.findById(eid).orElse(null);
	}

	@Override
	public String deleteByEid(int eid) {


		
		   repo.deleteById(eid);
		   
		   
		   
		   return "Record deleted for Eid "+eid;
	}

	@Override
	public Employee getByEname(String ename) {


		return  repo.findByEname(ename);
	}

	@Override
	public List<Employee> getBySalaryGT(double salary) {
		
		return repo.findBySalaryGreaterThan(salary);
	}

	@Override
	public List<Employee> getAllSorted() {
		
		
		//return  repo.findAll(Sort.by("ename")) ; // select * from Emp_Table order by  ename asc;
	
		return repo.findAll(Sort.by(Direction.DESC, "salary"));  // select * from Emp_Table order by  salary desc;  
										
	}

	@Override
	public List<Employee> getAllSortedByRange(double low, double high) {


		return repo.getAllSortedByRange(low, high);
	}

	@Override
	public double getSumOfSal() {
		
		return  repo.getSumOfSal();
	}

	@Override
	public List<Employee> getAllByNative() {
		// TODO Auto-generated method stub
		return  repo.getAllByNative();
	}
	
	
	

}