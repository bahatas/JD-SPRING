package com.cybertek.model;


import lombok.*;

import java.time.LocalDate;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Employee {

    private String firstname;
    private String lastname;
    private String birthday;
    private String email;
    private String password;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zip;


   /* public int ageCalculator(){
        return LocalDate.now().getYear()- getBirthday().getYear();
    }*/
}
