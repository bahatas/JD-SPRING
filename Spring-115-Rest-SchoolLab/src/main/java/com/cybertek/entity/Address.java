package com.cybertek.entity;

import com.cybertek.enums.AddressType;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Table(name = "address")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(value = {"hibernateLazyInitializer","teacher"},ignoreUnknown = true)
public class Address extends BaseEntity {

    private String street;
    private String country;
    private String state;
    private String city;

    @Column(name = "postal_code")
    private String postalCode;

    @Enumerated(EnumType.STRING)
    private AddressType addressType;

    @OneToOne(mappedBy = "address")
    @JoinColumn
    @JsonBackReference
    private Student student;

    @OneToOne(mappedBy = "address")
    @JsonIgnore
    private Parent parent;


    @JoinColumn
    @OneToOne(mappedBy = "address")
    private Teacher teacher;

    private Integer currentTemperature;

}