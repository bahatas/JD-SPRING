package com.cybertek.entity;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name="students")
public class Student {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "studentFirstName")
    private String firstName;

    @Column(name = "studentLastName")
    private String lastName;

    @Column(name = "studentEmail")
    private String email;

    @Transient
    private String city;

    @Temporal(value = TemporalType.DATE)
    private Date birthDate;
    @Temporal(TemporalType.TIME)
    private Date birthTime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date birthDateTime;


    @Column(name="DATE")
    private LocalDate localDate;

    @Column(name="TIME")
    private LocalDate localTime;

    @Column(name="TIMESTAMP")
    private LocalDate localDateTime;


}
