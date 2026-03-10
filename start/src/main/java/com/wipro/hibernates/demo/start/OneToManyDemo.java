package com.wipro.hibernates.demo.start;


	

	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;

import com.wipro.hibernate.entity.Customer;
import com.wipro.hibernate.entity.Product;

	

	public class OneToManyDemo {

	    public static void main(String[] args) {

	        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	        Session session = sessionFactory.openSession();

	        Transaction txn = session.beginTransaction();

	        Product p4 = new Product(104, "IPhone");
	        Product p5 = new Product(105, "Android");
	        Product p6 = new Product(106, "Airpods");

	        Customer customer2 = new Customer();
	        customer2.setCustomerId(2);
	        customer2.setCustomerName("Keerthi");

	        customer2.addProduct(p4);
	        customer2.addProduct(p5);
	        customer2.addProduct(p6);

	        session.persist(customer2);

	        txn.commit();
	        session.close();
	    }
	}