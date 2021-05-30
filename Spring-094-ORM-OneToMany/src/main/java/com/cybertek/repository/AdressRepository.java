package com.cybertek.repository;

import com.cybertek.entity.Adress;
import com.cybertek.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdressRepository extends JpaRepository<Adress,Long> {
}
