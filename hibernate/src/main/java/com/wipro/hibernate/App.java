package com.wipro.hibernate;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        SessionFactory  sessionFactory =			HibernateUtil.getSessionFactory();
        
        	Session session =	      sessionFactory.openSession();
        	
        		System.out.println(session);
        		
        		
        	Transaction tx =	    session.beginTransaction();
        	
        	// insert emp record
			
			/* Employee emp = new Employee();
			 
			emp.setEid(111); emp.setEname("Ford"); emp.setSalary(54000);
			 
			Serializable ser = session.save(emp);
			 
			 System.out.println("record inserted with id "+ ser); */
			
        	
   /*   Employee emp =		session.get(Employee.class, 111);
        
        				
        
        
        System.out.println("Before "+emp);
        	
        	emp.setSalary(70000);
        	
        	session.saveOrUpdate(emp);
        	
        	
        	System.out.println("After "+session.get(Employee.class, 111));
        	
        	
        		
        		session.delete(emp);*/
        	
        		
        		tx.commit();
        		
        		
        	
        
        
    }
}