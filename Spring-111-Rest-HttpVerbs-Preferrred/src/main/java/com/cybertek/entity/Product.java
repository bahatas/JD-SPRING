package com.cybertek.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String model;
    private LocalDateTime createTime= LocalDateTime.now();

    public Product(String name) {
        this.name = name;
    }

    public Product(String name, String model, LocalDateTime createTime) {
        this.name = name;
        Model = model;
        this.createTime = createTime;
    }
}
