package com.wipro.course.entity;





import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Course {   // Course Entity class

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int courseId;
    private String courseName;
    private double courseFee;

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public double getCourseFee() {
        return courseFee;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseFee(double courseFee) {
        this.courseFee = courseFee;
    }

    @Override
    public String toString() {
        return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseFee=" + courseFee + "]";
    }
}