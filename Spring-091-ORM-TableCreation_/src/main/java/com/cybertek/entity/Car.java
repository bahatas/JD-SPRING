package com.cybertek.entity;




import javax.persistence.*;

@Entity
@Table(name="cars")

public class Car {


    @Id
    private Long id;
    private String make;
    private String model;



}
