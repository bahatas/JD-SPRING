package com.cybertek.repository;

import com.cybertek.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


@Service
public interface PersonRepository  extends JpaRepository<Person,Long> {
}
