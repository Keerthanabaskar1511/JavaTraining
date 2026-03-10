package com.wipro.service;

import com.wipro.model.Employee;
import java.util.List;
public interface EmployeeService {
	 void addEmployee(Employee emp);
	    Employee getEmployee(int id) throws EmployeeNotFoundException;
	    List<Employee> getAllEmployees();
	    void updateEmployee(int id, String name, double salary) throws EmployeeNotFoundException;
	    void deleteEmployee(int id) throws EmployeeNotFoundException;

}