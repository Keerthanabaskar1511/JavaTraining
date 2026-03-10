package com.wipro.course.repository;





import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.course.entity.Course;

@Repository
public interface CourseRepository  extends JpaRepository<Course, Integer> {

}