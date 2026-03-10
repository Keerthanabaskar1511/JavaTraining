package com.wipro.course.restcontroller;





import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.wipro.course.dto.CourseDTO;
import com.wipro.course.entity.Course;
import com.wipro.course.exception.CourseNotFoundException;
import com.wipro.course.service.ICourseService;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;

@RestController
@RequestMapping("/api/courses")
public class CourseRestController {

    Logger logger = LoggerFactory.getLogger(CourseRestController.class);

    @Autowired
    ICourseService service;

    @PostMapping("/add")
    public Course addCourse(@RequestBody CourseDTO courseDTO) {
        return service.addCourse(courseDTO);
    }

    @PutMapping(value="/update", consumes="application/json")
    public Course updateCourse(@RequestBody CourseDTO courseDTO) {
        return service.updateCourse(courseDTO);
    }

    @GetMapping("/get/{courseId}")
    public CourseDTO getById(@PathVariable @Valid @Min(1) int courseId)
            throws CourseNotFoundException {

        CourseDTO courseDTO = service.getById(courseId);

        if (courseDTO.getCourseId() == 0) {
            throw new CourseNotFoundException(
                    HttpStatus.BAD_REQUEST,
                    "Course Not Found for Id : " + courseId
            );
        }
        return courseDTO;
    }

    @GetMapping("/getall")
    public List<Course> getAllCourses() {

        logger.debug("I am debug");
        logger.info("I am info");
        logger.warn("I am warning");
        logger.error("I am error");

        return service.getAllCourses();
    }

    @GetMapping("/div/{a}/{b}")
    public int div(@PathVariable int a, @PathVariable int b) {
        return a / b;
    }

    @ExceptionHandler({CourseNotFoundException.class})
    public ResponseEntity<String> handleCourseNotFoundExp(
            CourseNotFoundException ce) {

        return new ResponseEntity<>(
                ce.getMessage(),
                HttpStatus.BAD_REQUEST
        );
    }
}