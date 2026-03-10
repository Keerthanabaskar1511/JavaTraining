package com.wipro.student.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {

    private int id;
    private String name;
    private int marks;   // or fee if you used fee in JSP

    public StudentDTO() {
    }

    public StudentDTO(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
