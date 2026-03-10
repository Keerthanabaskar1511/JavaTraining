package com.wipro.student.restcontroller;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.wipro.student.exception.StudentNotFoundException;

@RestControllerAdvice
public class GlobalExceptionHandler {

 @ExceptionHandler(StudentNotFoundException.class)
 @ResponseStatus(HttpStatus.NOT_FOUND)
 public String handle(StudentNotFoundException ex){
  return ex.getMessage();
 }
}
