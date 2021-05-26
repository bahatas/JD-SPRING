package com.cybertek.entity;


import javax.persistence.*;

@Entity
@Table(name="students")
public class Student {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;



}
