package com.cybertek.controller;


import com.cybertek.model.ResponseWrapper;
import com.cybertek.model.Teacher;
import com.cybertek.repository.StudentRepository;
import com.cybertek.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiController {


    @Autowired
    TeacherRepository teacherRepository;
    @Autowired
    StudentRepository studentRepository;


    @GetMapping("/teachers")
    public List<Teacher> readAllteachers() {

        return teacherRepository.findAll();
    }

    @GetMapping("/students")
    public ResponseEntity<ResponseWrapper> readAllStudents() {

        return ResponseEntity
                .ok(new ResponseWrapper("Stundents retrieved successfully",studentRepository.findAll()));

    }

}
