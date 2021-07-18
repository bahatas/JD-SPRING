package com.cinema.entity;

import com.cinema.enums.State;
import com.cinema.enums.Type;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
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

    @ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    List<Cinema> cinema;


}
