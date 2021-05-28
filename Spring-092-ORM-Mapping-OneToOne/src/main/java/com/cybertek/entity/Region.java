package com.cybertek.entity;


import com.cybertek.util.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="regions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Region extends BaseEntity {



    private String region;
    private String country;

}
