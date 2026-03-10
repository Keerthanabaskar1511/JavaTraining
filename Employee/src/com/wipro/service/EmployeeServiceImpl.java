package com.wipro.service;

import com.wipro.model.Employee;
import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    private List<Employee> empList = new ArrayList<>();

    @Override
    public void addEmployee(Employee emp) {
        empList.add(emp);
    }

    @Override
    public Employee getEmployee(int id) throws EmployeeNotFoundException {
        for (Employee emp : empList) {
            if (emp.getId() == id) {
                return emp;
            }
        }
        throw new EmployeeNotFoundException("Employee not found with ID: " + id);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return empList;
    }

    @Override
    public void updateEmployee(int id, String name, double salary) throws EmployeeNotFoundException {
        Employee emp = getEmployee(id);
        emp.setName(name);
        emp.setSalary(salary);
    }

    @Override
    public void deleteEmployee(int id) throws EmployeeNotFoundException {
        Employee emp = getEmployee(id);
        empList.remove(emp);
    }
}
