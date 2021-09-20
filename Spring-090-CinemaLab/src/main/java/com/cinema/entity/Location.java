package com.cinema.entity;


import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
public class Location extends BaseEntity {

    private  String name;
    private BigDecimal latitude;
    private BigDecimal  longtitude;
    private String country;
    private String city;
    private String state;
    private  String postalCode;
    private String address;

}
