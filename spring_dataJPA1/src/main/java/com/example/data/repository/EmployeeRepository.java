package com.example.data.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.data.entity.Employee;

@Repository

public interface EmployeeRepository  extends JpaRepository<Employee, Integer> {
	
	
				public Employee  findByEname(String ename);
				// select * from Emp_Table where ename =?;
				
				public List<Employee>  findBySalaryGreaterThan(double salary);
				
				// select * from Emp_Table where salary > ?;
				
				// HQL or JPQL
				//@Query("Select  e  from  Employee  e  where  e.salary between  ?1  and ?2")
				
				@Query("Select  e  from  Employee  e  where  e.salary between  :low  and :high")
				public List<Employee>  getAllSortedByRange(double low , double high);
			
				
				
				public  double  getSumOfSal();
				
				// write Native query
				
				
				@NativeQuery(value = "select * from Emp_details" )
				public List<Employee>  getAllByNative();
				
				//HQL or JPQL
				
				@Modifying
				@Query("update Employee e set e.salary= :s1 where eid=?1 ")
				public void updateSalary(int eid, @Param("s1") double salary)
				
				

}
