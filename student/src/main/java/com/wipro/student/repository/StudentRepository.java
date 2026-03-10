package com.wipro.student.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.wipro.student.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>{
}
