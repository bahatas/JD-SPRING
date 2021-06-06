package com.cybertek.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name = "departments")
@NoArgsConstructor
@Getter
@Setter
@Entity
@ToString

public class Department {

    @Id
    private String department;
    private String division;
}
