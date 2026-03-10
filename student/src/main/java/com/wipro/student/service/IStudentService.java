package com.wipro.student.service;

import java.util.List;
import com.wipro.student.dto.StudentDTO;
import com.wipro.student.entity.Student;

public interface IStudentService {

 Student addStudent(StudentDTO dto);
 Student getStudent(int id);
 List<Student> getAll();
 Student updateStudent(int id,StudentDTO dto);
 void deleteStudent(int id);
}

