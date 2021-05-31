package com.cybertek.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import sun.security.x509.CertificateIssuerName;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
@Getter
@Setter
@NoArgsConstructor

public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private String description;

    @ManyToMany(mappedBy = "film", cascade = CascadeType.ALL)
    private Set<Cinema> cinema= new HashSet<>();


    public Film(String title, String description) {
        this.title = title;
        this.description = description;
    }
}


