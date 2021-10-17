package com.ing.entities;

import com.ing.entities.ids.StudentCourseId;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "studentcourse")
@IdClass(StudentCourseId.class)
public class StudentCourseEntity {

    @Column
    @Id
    @Getter
    private String coursename;

    @Id
    @Column @Getter
    private String student;

    @Column @Getter
    private String grade;

    @Column @Getter
    private String passFail;


    public StudentCourseEntity() {}

    /**
     * Constructor
     * @param coursename name of the course
     * @param student student username
     * @param grade grade in %
     * @param passFail passed or failed
     */
    public StudentCourseEntity(String coursename, String student, String grade, String passFail) {
        this.coursename = coursename;
        this.student = student;
        this.grade = grade;
        this.passFail = passFail;
    }

    /**
     * Simple toString method
     * @return String of a StudentCourse class.
     */
    @Override
    public String toString() {
        return String.format("StudentCourse[coursename='%d', student='%s', grade='%s', passed or failed = '%s']",
                coursename, student, grade, passFail);
    }

}
