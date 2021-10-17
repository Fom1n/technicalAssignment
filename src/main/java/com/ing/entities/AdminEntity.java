package com.ing.entities;

import lombok.Getter;

import javax.persistence.*;

/**
 * Entity for Admins, as stored in the database.
 */
@Entity
@Table(name="admins")
public class AdminEntity {


    @Column @Id @Getter
    private String username;

    @Column @Getter
    private String password;

    public AdminEntity() {}

    /**
     * Constructor
     * @param username username of an admin
     * @param password admin password
     */
    public AdminEntity(String username, String password) {
        this.username = username;
        this.password = password;
    }

    /**
     * Simple toString method
     * @return String of an admin.
     */
    @Override
    public String toString() {
        return String.format("Admin[username='%d', password='%s']", username, password);
    }

}
