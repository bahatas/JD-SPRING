package com.cybertek.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "regions")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Region extends  BaseEntity{



    private String region;
    private String country;
}
