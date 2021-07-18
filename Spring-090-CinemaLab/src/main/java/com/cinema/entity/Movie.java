package com.cinema.entity;

import com.cinema.enums.State;
import com.cinema.enums.Type;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "movies")
public class Movie extends BaseEntity{

    String name;
    Double price;
    Type type;
    State state;

    LocalDate releaseDate;
    Integer duration;

    String summary;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    @JoinTable(name = "cinema_movie_join_table",
            joinColumns = {@JoinColumn(name = "cinema_id")},
            inverseJoinColumns = {@JoinColumn(name = "movie_id")})
    List<Cinema> cinema;


}
