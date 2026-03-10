package com.wipro.hibernates.mapping;



import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.wipro.hibernate.mapping.entity.Address;
import com.wipro.hibernate.mapping.entity.Student;

public class OneToOneMappingDemo {

	public static void main(String[] args) {

		Session session = HibernateUtil.getSessionFactory().openSession();

		// Uni directional one to one  injecting addr object into student
		
		
		/*
		 * Address addr = new Address(10,"Hyderabad");
		 * 
		 * Student student = new Student(101, "King", addr);
		 */
		 

		// bi directional address injects student

		
		 
		/*
		  Address address = new Address();
		  
		  
		  address.setAddressId(50); address.setCity("Pune");
		  
		  Student student = new Student(105, "ford",address);
		  
		  address.setStudent(student);
		 
		 

		Transaction tr = session.beginTransaction();

		//session.persist(student);
		
		session.persist(address);// insert student obj*/
		
		
		/*  Address address1 = new Address();
		  
		  
		  address1.setAddressId(51); address1.setCity("Pondy");
		  
		  Student student1 = new Student(106, "Keerthana",address1);
		  
		  address1.setStudent(student1);*/
		

		
		 /* Address addr1 = new Address(107,"Bangalore");
		  
		  Student student4 = new Student(108, "Kirthi", addr1);*/
		
		  Address address3 = new Address();
		  
		  
		  address3.setAddressId(54); address3.setCity("Kerala");
		  
		  Student student6 = new Student(107, "Kirthi",address3);
		  
		  address3.setStudent(student6);
		 
		 
		 
		 

		Transaction tr = session.beginTransaction();

		//session.persist(student);
		
		session.persist(address3);// insert student obj

		
		tr.commit();

	}

}

