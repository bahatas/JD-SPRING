package com.cybertek.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
@Getter
@Setter
@NoArgsConstructor

public class Cinema {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

     @ManyToMany(cascade = CascadeType.ALL)
     @JoinTable(
             name="cinema_like",
             joinColumns ={@JoinColumn(name="cinema_id")},inverseJoinColumns ={@JoinColumn(name = "film_id")})
    private Set<Film> film = new HashSet<>();

    public Cinema(String name) {
        this.name = name;
    }
}
