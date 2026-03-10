package com.wipro.springrestcrud.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.springrest.dto.EmployeeDTO;
import com.wipro.sprinrestcrud.entity.Employee;
import com.eipro.springrest.repository.EmployeeRepository;

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
	
	
	

}
