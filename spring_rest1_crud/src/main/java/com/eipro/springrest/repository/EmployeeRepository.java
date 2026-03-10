package com.eipro.springrest.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.sprinrestcrud.entity.Employee;


@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, Integer> {

}