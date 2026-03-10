package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.demo.entity.Student;
import com.demo.service.StudentService;

@Controller
public class StudentController {

 @Autowired
 private StudentService service;

 @GetMapping("/")
 public String showForm(){
  return "index";
 }

 @PostMapping("/save")
 public String save(Student s){
  service.saveStudent(s);
  return "success";
 }
}

