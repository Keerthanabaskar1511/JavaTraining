package com.wipro.hibernates.demo.start;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.wipro.hibernate.entity.Author;
import com.wipro.hibernate.entity.Book;

public class OneToOneDemo {

    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();
      

		/*
		 * Author author = new Author(1, "Robert Martin"); Book book = new Book(101,
		 * "Clean code", author);
		 */
        
        Author author2 = new Author();
        author2.setAuthorId(10); author2.setAuthorName("Charle");
        Book book2 = new Book(3,"school",author2);
        
        author2.setBook(book2);
        Transaction tx = session.beginTransaction();
        session.persist(author2);
        session.persist(book2);

        tx.commit();
        session.close();
    }
}