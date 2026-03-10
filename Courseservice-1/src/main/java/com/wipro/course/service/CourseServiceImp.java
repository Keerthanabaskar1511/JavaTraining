package com.wipro.course.service;



import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.course.dto.CourseDTO;
import com.wipro.course.entity.Course;
import com.wipro.course.repository.CourseRepository;

@Service
public class CourseServiceImp implements ICourseService {

    @Autowired
    CourseRepository repo;

    Logger logger = LoggerFactory.getLogger(CourseServiceImp.class);

    @Override
    public Course addCourse(CourseDTO courseDTO) {
        Course course = new Course();

        course.setCourseName(courseDTO.getCourseName());
        course.setCourseFee(courseDTO.getCourseFee());

        return repo.save(course);
    }

    @Override
    public Course updateCourse(CourseDTO courseDTO) {
        Course course = new Course();

        course.setCourseId(courseDTO.getCourseId());
        course.setCourseName(courseDTO.getCourseName());
        course.setCourseFee(courseDTO.getCourseFee());

        return repo.save(course);
    }

    @Override
    public CourseDTO getById(int courseId) {

        Course course = repo.findById(courseId).orElse(new Course());

        CourseDTO dto = new CourseDTO();
        dto.setCourseId(course.getCourseId());
        dto.setCourseName(course.getCourseName());
        dto.setCourseFee(course.getCourseFee());

        return dto;
    }

    @Override
    public List<Course> getAllCourses() {
        logger.info("get all from course service");
        logger.warn("get all from course service");

        return repo.findAll();
    }
}
