package com.wipro.hibernatedemo;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.wipro.hibernate.entity.Employee;

public class HibernateSelectQuery {
	
	
		public static void main(String[] args) {
			


		   SessionFactory  sessionFactory =		HibernateUtil.getSessionFactory();
		    
		    Session  session =			sessionFactory.openSession();
		    
		    //HQL or JPQL  with positional parameters
		    String selectQuery = "select  e  from  Employee e where e.eid = ?1 AND  e.ename = ?2";
		    
		    Query<Employee>  query =		session.createQuery(selectQuery);
		    
		    		query.setParameter(1, 102);
		    		query.setParameter(2, "tommy");
			
		    Employee emp =		query.getSingleResult();
		    
		    	//	query.executeUpdate(); // for DML Queries
		    
		    System.out.println(emp);
		    
		    // HQL query with named parameter
		    String  selectQuery2 = "select e from Employee e  where  e.salary > :sal";
		    
		    Query<Employee>  query2 =		session.createQuery(selectQuery2);
		    
		    	query2.setParameter("sal", 15000.0);
    		
    		List<Employee>  list =		query2.getResultList();
		    
		    System.out.println(list);
			
		}

}