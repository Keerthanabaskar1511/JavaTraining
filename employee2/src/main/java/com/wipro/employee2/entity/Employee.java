package com.wipro.employee2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQueries;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

//@NamedNativeQueries
@NamedQueries(@NamedQuery(name = "Employee.getSumOfSal" , query = "select  sum(e.salary) from Employee e"))
@Entity
@Table(name = "EmpDetails")
public class Employee {

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int eid;
	private String ename;
	private double salary;

	
	
	public Employee() {
		super();
	}

	public Employee(int eid, String ename, double salary) {
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