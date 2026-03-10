package com.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.StudentDao;
import com.demo.entity.Student;
import com.demo.service.StudentService;

@Service
public class StudentServiceImp implements StudentService {

 private StudentDao dao;

 @Autowired
 public StudentServiceImp(StudentDao dao){
  this.dao = dao;
 }

 @Override
 public void saveStudent(Student s){
  dao.save(s);
 }
}

