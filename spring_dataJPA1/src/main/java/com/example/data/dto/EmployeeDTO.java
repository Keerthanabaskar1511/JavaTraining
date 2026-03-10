package com.example.data.dto;


import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class EmployeeDTO {  // pojo or dto
	
	//@Min(value = 100 , message = "eid should be min 100")
	private int eid;
	
	@Pattern(regexp = "[A-Z][a-z]{3}")
	private String ename;
	
	
	@Max(value = 20000)
	private double salary;
	
	

public EmployeeDTO() {
	super();
}

public EmployeeDTO(int eid, String ename, double salary) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.salary = salary;
}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}

}