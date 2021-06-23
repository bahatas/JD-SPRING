package com.cybertek.entity;


import com.cybertek.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Table(name="parent")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Parent extends BaseEntity{

 private String firstName;
 private String lastName;
 private String email;
 private String username;
 private String password;
 private LocalDate birthday;
 private String phoneNumber;
 private Status status;
 private String profession;

 @OneToOne
 @JoinColumn
 private Address adress;



}
