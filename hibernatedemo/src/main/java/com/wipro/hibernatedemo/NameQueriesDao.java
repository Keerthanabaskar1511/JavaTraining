package com.wipro.hibernatedemo;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.wipro.hibernate.entity.Employee;

public class NameQueriesDao {
	
	
	 SessionFactory  sessionFactory =		HibernateUtil.getSessionFactory();
	    
	    Session  session =			sessionFactory.openSession();
	    
	
	
			public static void main(String[] args) {
				
				
					NameQueriesDao dao = new NameQueriesDao();
					
				List<Employee>  list =	dao.getAllEmployees();
				
					list.forEach(System.out::println);
					
					
					List<Employee>  list2 =			dao.getBySalary(9000);
								
					
					list2.forEach(System.out::println);
				
			}
	
	
	
		public  List<Employee>   getAllEmployees() {
			

			  
			    
			 Query<Employee> query =      session.createNamedQuery("getAllEmployees");
			
			List<Employee>  list = 	query.getResultList();
			
			return list;
			
		}
	
		
		public  List<Employee>   getBySalary(double salary) {
			
		
			
			 Query<Employee> query = 		session.createNamedQuery("getBySalary");
			 
			 				query.setParameter(1, salary);
					
					List<Employee>  list = 	query.getResultList();
					
					return list;
			
		}
	
	

}