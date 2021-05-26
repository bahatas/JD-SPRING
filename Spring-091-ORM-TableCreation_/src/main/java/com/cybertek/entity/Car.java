package com.cybertek.entity;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {


    @Id
    private Long id;
    private String make;
    private String model;



}
