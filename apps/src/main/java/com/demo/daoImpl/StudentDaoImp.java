package com.demo.daoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.dao.StudentDao;
import com.demo.entity.Student;

@Repository
public class StudentDaoImp implements StudentDao {

 @Autowired
 private SessionFactory factory;

 @Override
 public void save(Student s) {

  Session session = factory.getCurrentSession();
  session.save(s);
 }
}

