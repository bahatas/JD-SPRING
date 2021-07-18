package com.cinema.entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "cinema")
public class Cinema extends BaseEntity {
    String name;
    String sponsoredName;

    @ManyToOne
    Location location;

    @ManyToMany(mappedBy = "cinema")
    List<Movie> movie;


}
