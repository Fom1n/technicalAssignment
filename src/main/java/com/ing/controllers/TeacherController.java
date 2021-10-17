package com.ing.controllers;

import com.ing.entities.TeacherEntity;
import com.ing.repositories.TeacherRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {

    @GetMapping("/createteacher")
    void testInsert() {
        new TeacherRepository().insertTeacher(new TeacherEntity("teacher1", "name", "2name", "pwd"));
    }

}
