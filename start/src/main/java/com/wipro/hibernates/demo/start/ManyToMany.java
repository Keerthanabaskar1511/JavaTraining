package com.wipro.hibernates.demo.start;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.wipro.hibernate.entity.Course;
import com.wipro.hibernate.entity.Student;



public class ManyToMany {

    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction txn = session.beginTransaction();

        Course c1 = new Course();
        c1.setCourseId(101);
        c1.setCourseName("Java Full Stack");

        Course c2 = new Course();
        c2.setCourseId(102);
        c2.setCourseName("Devops");

        Course c3 = new Course();
        c3.setCourseId(103);
        c3.setCourseName("AI");

        Student s1 = new Student();
        s1.setStudentId(1);
        s1.setStudentName("Keerthana");

        s1.addCourse(c1);
        s1.addCourse(c3);

        Student s2 = new Student();
        s2.setStudentId(2);
        s2.setStudentName("Richard");

        s2.addCourse(c1);
        s2.addCourse(c2);
        s2.addCourse(c3);

        session.persist(s1);
        session.persist(s2);

        txn.commit();
        session.close();
    }
}