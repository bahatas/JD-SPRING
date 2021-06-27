package com.cybertek.controller;


import com.cybertek.model.ResponseWrapper;
import com.cybertek.model.Teacher;
import com.cybertek.repository.AddressRepository;
import com.cybertek.repository.ParentRepository;
import com.cybertek.repository.StudentRepository;
import com.cybertek.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiController {


    @Autowired
    TeacherRepository teacherRepository;
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    ParentRepository parentRepository;

    @Autowired
    AddressRepository addressRepository;


    @GetMapping("/teachers")
    public List<Teacher> readAllteachers() {

        return teacherRepository.findAll();
    }

    @GetMapping("/students")
    public ResponseEntity<ResponseWrapper> readAllStudents() {

        return ResponseEntity
                .ok(new ResponseWrapper("Students retrieved successfully",studentRepository.findAll()));

    }

    @GetMapping("/parents")
    public ResponseEntity<ResponseWrapper> readAllParents(){

//        return ResponseEntity.
//                ok(new ResponseWrapper("Parents retrieved Successfully",parentRepository.findAll()));
        ResponseWrapper responseWrapper = new ResponseWrapper(true,"Parents are successfully retrieved",
                HttpStatus.ACCEPTED.value(), parentRepository.findAll());

        return ResponseEntity.ok(responseWrapper);

    }

    @GetMapping("/adress/{id}")
    public ResponseEntity<ResponseWrapper> readAdressById(@PathVariable("id") Long id){

        return
                ResponseEntity.ok(new ResponseWrapper("adress by id",addressRepository.findById(id)));
    }
}
