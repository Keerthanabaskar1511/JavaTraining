package com.wipro.student.restcontroller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.wipro.student.dto.StudentDTO;
import com.wipro.student.entity.Student;

@SpringBootTest
class StudentRestControllerTest {

 @Autowired
 RestTemplate restTemplate;

 @Test
 
 void testAddStudent() {

  StudentDTO requestBody = new StudentDTO(104,"Ajay",85);

  ResponseEntity<Student> response =
   restTemplate.postForEntity(
    "http://localhost:8080/student/add",
    requestBody,
    Student.class
   );

  Student stu = response.getBody();

  assertEquals(104, stu.getId());
 }

 @Test
 @Disabled
 void testAddStudent2() {

  StudentDTO requestBody = new StudentDTO(105,"Vijay",80);

  Student stu =
   restTemplate.postForObject(
    "http://localhost:8080/student/add",
    requestBody,
    Student.class
   );

  assertTrue(stu.getId() > 0);
 }

 @Test
 @Disabled
 void testUpdateStudent() {

  StudentDTO requestBody =
   new StudentDTO(105,"Vijay Kumar",95);

  restTemplate.put(
   "http://localhost:8080/student/update/105",
   requestBody
  );
 }

 @Test
 @Disabled
 void testGetStudent() {

  int id = 105;

  ResponseEntity<Student> response =
   restTemplate.getForEntity(
    "http://localhost:8080/student/"+id,
    Student.class
   );

  Student stu = response.getBody();

  assertEquals(95, stu.getMarks());
 }

 @Test
 @Disabled
 void testDeleteStudent() {

  // restTemplate.delete("http://localhost:8080/student/delete/105");

 }
}

