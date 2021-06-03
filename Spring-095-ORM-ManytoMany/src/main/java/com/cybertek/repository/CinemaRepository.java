package com.cybertek.repository;

import com.cybertek.entity.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Repository
public interface CinemaRepository extends JpaRepository<Cinema, Long> {
}
