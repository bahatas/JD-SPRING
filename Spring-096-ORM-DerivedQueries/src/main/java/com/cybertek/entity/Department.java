package com.cybertek.entity;




import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name = "departments")
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Department {

    @Id
    private String department;
    private String division;
}
