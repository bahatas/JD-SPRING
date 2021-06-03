package com.cybertek.repository;


import com.cybertek.entity.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Repository
public interface FilmRepository extends JpaRepository<Film, Long> {
}

