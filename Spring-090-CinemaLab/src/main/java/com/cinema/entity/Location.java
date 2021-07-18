package com.cinema.entity;


import javax.persistence.Entity;

@Entity
public class Location extends BaseEntity {

    String name;
    String latitude;
    String longtitude;
    String country;
    String city;
    String state;
    String postalCode;
    String adress;

}
