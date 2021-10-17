package com.ing.entities;

import lombok.Getter;

import javax.persistence.*;

/**
 * Entity for Students, as stored in the database.
 */
@Entity
@Table(name="students")
public class StudentEntity {


    @Column @Id @Getter
    private String username;

    @Column @Getter
    private String firstName;

    @Column @Getter
    private String lastName;

    public StudentEntity() {}

    /**
     * Constructor
     * @param username username of a student
     * @param firstName first name of a student
     * @param lastName last name of a student
     */
    public StudentEntity(String username, String firstName, String lastName) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Simple toString method
     * @return String of a student.
     */
    @Override
    public String toString() {
        return String.format("Student[id='%d', firstName='%s', lastName='s'", username, firstName, lastName);
    }

}
