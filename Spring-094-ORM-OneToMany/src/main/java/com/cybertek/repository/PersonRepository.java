package com.cybertek.repository;

import com.cybertek.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository  extends JpaRepository<Person,Long> {
}
