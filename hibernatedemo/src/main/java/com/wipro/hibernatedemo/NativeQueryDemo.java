package com.wipro.hibernatedemo;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;

import com.wipro.hibernate.entity.Employee;

public class NativeQueryDemo {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

				//SQL
		String selectQuery = "select * from Emp_Table";

		NativeQuery<Employee> nativeQuery = session.createNativeQuery(selectQuery,Employee.class);
		
				List<Employee>  list =			nativeQuery.getResultList();
				
			//	nativeQuery.executeUpdate();  // DML Queries
				
				System.out.println(list);
				
				list.forEach(System.out::println);

	}

}