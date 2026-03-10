package com.wipro.student.service;


import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.wipro.student.dto.StudentDTO;
import com.wipro.student.entity.Student;

@SpringBootTest
class StudentServiceImpTest {

 @Autowired
 IStudentService service;

 @BeforeAll
 static void setUpBeforeClass() throws Exception {
 }

 @Test
@Disabled
 void testAddStudent() {

  StudentDTO dto = new StudentDTO(103,"Rahul",90);

  Student stu = service.addStudent(dto);

  out.print("add() tested...");

  assertNotNull(stu);
 }

 @Test
 @Disabled
 void testGetStudent() {

  Student stu = service.getStudent(103);

  assertEquals(90.0, stu.getMarks());
 }

 @Test
 @Disabled
 void testGetAll() {

  List<Student> list = service.getAll();

  assertNotNull(list);

  assertTrue(list.size() > 0);
 }
}

