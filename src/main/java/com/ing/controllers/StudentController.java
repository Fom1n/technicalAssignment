package com.ing.controllers;

import com.ing.entities.StudentEntity;
import com.ing.repositories.StudentRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST controller for Students
 */
@RestController
public class StudentController {

    /**
     * Test method to create a simple student
     */
    @GetMapping("/students")
    void allStudents() {
        new StudentRepository()
                .insertStudent(new StudentEntity("ofomin","o","a","pwd"));
    }

    /**
     * Test api request
     * @return
     */
    @GetMapping("/test")
    String test() {
        return "test";
    }

}
