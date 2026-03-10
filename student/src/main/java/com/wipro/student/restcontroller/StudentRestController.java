package com.wipro.student.restcontroller;



import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.wipro.student.dto.StudentDTO;
import com.wipro.student.entity.Student;
import com.wipro.student.service.IStudentService;

@RestController
@RequestMapping("/student")
public class StudentRestController {

 @Autowired
 private IStudentService service;

 @PostMapping("/add")
 public Student add(@RequestBody StudentDTO dto){
  return service.addStudent(dto);
 }

 @GetMapping("/{id}")
 public Student get(@PathVariable int id){
  return service.getStudent(id);
 }

 @GetMapping("/all")
 public List<Student> all(){
  return service.getAll();
 }

 @PutMapping("/update/{id}")
 public Student update(@PathVariable int id,@RequestBody StudentDTO dto){
  return service.updateStudent(id,dto);
 }

 @DeleteMapping("/delete/{id}")
 public String delete(@PathVariable int id){
  service.deleteStudent(id);
  return "Deleted";
 }
 

}
