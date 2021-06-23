package com.cybertek.entity;

import com.cybertek.enums.EducationLevel;
import com.cybertek.enums.Status;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.time.LocalDate;

@Table(name = "teacher")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Teacher extends BaseEntity {

    private String lastName;
    private String email;
    private String username;


    private String password;

    private LocalDate birthday;

    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    private Status status;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "address_id")
    private Address address;

    @Enumerated(EnumType.STRING)
    //@Column(name = "education_level")
    private EducationLevel educationLevel;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    private Parent parent;

}