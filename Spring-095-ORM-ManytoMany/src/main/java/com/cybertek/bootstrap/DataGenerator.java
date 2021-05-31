package com.cybertek.bootstrap;

import com.cybertek.entity.Cinema;
import com.cybertek.entity.Film;
import com.cybertek.repository.CinemaRepository;
import com.cybertek.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements CommandLineRunner {

    @Autowired
    CinemaRepository cinemaRepository;

    @Autowired
    FilmRepository filmRepository;



    @Override
    public void run(String... args) throws Exception {
        Cinema cinema1 = new Cinema("Cinemarine");
        Cinema cinema2 = new Cinema("MaxCinema");
        Cinema cinema3 = new Cinema("BestCinemma");

        Film film1 = new Film("F1","Real Story");
        Film film2 = new Film("Funny movie","Comedy");
        Film film3 = new Film("Horror games","Horror");

        cinema1.getFilm().add(film1);
        cinema1.getFilm().add(film2);
        cinema1.getFilm().add(film3);

        cinema1.getFilm().add(film3);
        cinema2.getFilm().add(film3);
        cinema3.getFilm().add(film3);

        film2.getCinema().add(cinema3);

        cinemaRepository.save(cinema1);
        cinemaRepository.save(cinema2);
        cinemaRepository.save(cinema3);


        filmRepository.save(film2);

    }
}
