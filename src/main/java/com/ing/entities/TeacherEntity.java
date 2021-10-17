package com.ing.entities;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="teachers")
public class TeacherEntity {

    @Column
    @Id
    @Getter
    private String username;

    @Column @Getter
    private String firstName;

    @Column @Getter
    private String lastName;

    @Column @Getter
    private String password;

    public TeacherEntity() {}

    /**
     * Constructor
     * @param username username of a teacher
     * @param firstName first name of a teacher
     * @param lastName last name of a teacher
     */
    public TeacherEntity(String username, String firstName, String lastName, String password) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
    }

    /**
     * Simple toString method
     * @return String of a teacher.
     */
    @Override
    public String toString() {
        return String.format("Teacher[username='%d', firstName='%s', lastName='%s', password='%s'", username, firstName, lastName, password);
    }

}
