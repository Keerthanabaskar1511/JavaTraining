package com.wipro.student.service;



import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wipro.student.dto.StudentDTO;
import com.wipro.student.entity.Student;
import com.wipro.student.exception.StudentNotFoundException;
import com.wipro.student.repository.StudentRepository;

@Service
public class StudentServiceImp implements IStudentService{

 @Autowired
 private StudentRepository repo;

 public Student addStudent(StudentDTO dto){
  Student s=new Student(dto.getId(),dto.getName(),dto.getMarks());
  return repo.save(s);
 }

 public Student getStudent(int id){
  return repo.findById(id)
   .orElseThrow(()->new StudentNotFoundException("Student not found"));
 }

 public List<Student> getAll(){
  return repo.findAll();
 }

 public Student updateStudent(int id,StudentDTO dto){
  Student s=getStudent(id);
  s.setName(dto.getName());
  s.setMarks(dto.getMarks());
  return repo.save(s);
 }

 public void deleteStudent(int id){
  repo.deleteById(id);
 }
}
