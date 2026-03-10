package com.wipro.course.service;




import java.util.List;

import com.wipro.course.dto.CourseDTO;
import com.wipro.course.entity.Course;

public interface ICourseService {

    public Course addCourse(CourseDTO courseDTO);

    public CourseDTO getById(int courseId);

    public List<Course> getAllCourses();

    public Course updateCourse(CourseDTO courseDTO);
}