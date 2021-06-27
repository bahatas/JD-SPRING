package com.cybertek.controller;


import com.cybertek.model.Address;
import com.cybertek.model.ResponseWrapper;
import com.cybertek.model.Teacher;
import com.cybertek.repository.AddressRepository;
import com.cybertek.repository.ParentRepository;
import com.cybertek.repository.StudentRepository;
import com.cybertek.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/address/{id}")
    public ResponseEntity<ResponseWrapper> readAdressById(@PathVariable("id") Long id){

        return
                ResponseEntity.ok(new ResponseWrapper("adress by id",addressRepository.findById(id)));
    }

    @PutMapping("/address/{id}")
    public ResponseEntity<ResponseWrapper> updateAddressById(@PathVariable("id") Long id, @RequestBody Address address ) throws Exception {


        Optional<Address> foundAddress = addressRepository.findById(id);

        if(!foundAddress.isPresent()){
            throw new Exception("Adress does not exist");
        }

        address.setCurrentTemperature(new Address().consumeTemp(address.getCity()));
        address.setId(foundAddress.get().getId());

        ResponseWrapper responseWrapper = new ResponseWrapper(true,"City temperature is updated",
                HttpStatus.ACCEPTED.value(), addressRepository.save(address));

        return ResponseEntity.ok(responseWrapper);
    }
}
