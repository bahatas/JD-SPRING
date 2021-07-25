package com.cinema.entity;

import com.cinema.enums.MovieType;
import com.cinema.enums.State;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "movies")
public class Movie extends BaseEntity {

    private String name;
    private BigDecimal price;

    @Enumerated(EnumType.STRING)
    private MovieType type;

    @Enumerated(EnumType.STRING)
    private State state;

    private LocalDate releaseDate;
    private Integer duration;

    @Column(columnDefinition = "text")
    private String summary;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    @JoinTable(name = "cinema_movie_join_table",
            joinColumns = {@JoinColumn(name = "cinema_id")},
            inverseJoinColumns = {@JoinColumn(name = "movie_id")})
    private List<Cinema> cinema;

    @ManyToMany
    @JoinTable(name = "movie_genre_rel",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "genre_id")
    )
    private List<Genre> genreList;


}
