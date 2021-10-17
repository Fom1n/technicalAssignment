package com.ing.controllers;

import com.ing.entities.AdminEntity;
import com.ing.entities.StudentEntity;
import com.ing.repositories.AdminRepository;
import com.ing.repositories.StudentRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    /**
     * Test method to create a simple student
     */
    @GetMapping("/createadmin")
    void testInsert() {
        new AdminRepository()
                .insertAdmin(new AdminEntity("ofomin", "pwd"));
    }

}
