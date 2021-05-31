package com.cybertek.repository;

import com.cybertek.entity.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


@Service
public interface CinemaRepository extends JpaRepository<Cinema, Long> {
}
