package com.cybertek.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Adress {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String street;
    private String zipCode;

    @ManyToOne
    private Person person;


    public Adress(String street, String zipCode) {
        this.street = street;
        this.zipCode = zipCode;
    }
}
