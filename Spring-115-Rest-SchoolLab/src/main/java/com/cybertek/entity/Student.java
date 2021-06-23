package com.cybertek.entity;

import com.cybertek.enums.Status;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Table(name = "student")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student extends BaseEntity{

    private String firstName;
    private String lastName;
    private String email;
    private String username;


    private String password;

    private LocalDate birthday;

    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    private Status status;

    @OneToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "address_id")
    private Address address;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    private Parent parent;
}