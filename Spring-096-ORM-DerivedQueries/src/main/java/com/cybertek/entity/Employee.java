package com.cybertek.entity;


import com.cybertek.enums.Gender;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "employees")
@NoArgsConstructor
@Getter
@Setter
public class Employee extends BaseEntity{

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private String email;

    @Column(columnDefinition = "DATE")
    private LocalDateTime hireDate;

    @ManyToOne
    @JoinColumn(name = "department")
    private Department department;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private Integer salary;

    @ManyToOne
    @JoinColumn(name = "region_id")
    private  Region region;


}
