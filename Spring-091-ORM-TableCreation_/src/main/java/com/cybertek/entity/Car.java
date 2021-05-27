package com.cybertek.entity;




import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="cars")
@NoArgsConstructor
@Getter
@Setter

public class Car {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String make;
    private String model;


    public Car(String bmw, String m5) {
        this.make=make;
        this.model=model;
    }
}
