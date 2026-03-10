package com.wipro.hibernatedemo;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

public class CriteriaQueriesDemo {
	public static void main(String[] args) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		Criteria cq=session.createCriteria(Employee.class);
		
		cq.setProjection(Projections.rowCount());
		cq.setProjection(Projections.avg("salary"));
		cq.setProjection(Projections.sum("salary"));
		cq.addOrder(Order.desc("ename"));
		List list=cq.list();
		System.out.println(list);
				
	}	
	}

}
