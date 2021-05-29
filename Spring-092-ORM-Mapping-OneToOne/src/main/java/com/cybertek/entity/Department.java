package com.cybertek.entity;




import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name="departments")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Department extends BaseEntity{


    private String department;

    private String division;

    @OneToOne(mappedBy ="department")
    private Employee employee;

    public Department(String department, String division) {
        this.department = department;
        this.division = division;
    }
}
