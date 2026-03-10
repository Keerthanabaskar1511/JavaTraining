package com.wipro.course.exception;





import org.springframework.http.HttpStatusCode;
import org.springframework.web.server.ResponseStatusException;

public class CourseNotFoundException extends ResponseStatusException {

    public CourseNotFoundException(HttpStatusCode status, String msg) {
        super(status, msg);
    }
}