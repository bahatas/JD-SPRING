package com.cybertek.entity;


import com.cybertek.util.Gender;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name="employees")
@Getter
@Setter
@NoArgsConstructor


public class Employee extends BaseEntity{



    private String firstName;
    private String lastName;
    private String email;
    private LocalDate hireDate;


    @Enumerated(EnumType.STRING)
    private Gender gender;
    private int salary;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="department_id")
    private Department department;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "regions")
    private Region region;


//    Dummy data will be created so we need constructor


    public Employee(String firstName, String lastName, String email, LocalDate hireDate, Gender gender, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.hireDate = hireDate;
        this.gender = gender;
        this.salary = salary;
    }



}
