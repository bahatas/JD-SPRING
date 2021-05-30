package com.cybertek.bootstrap;

import com.cybertek.entity.Adress;
import com.cybertek.entity.Person;
import com.cybertek.repository.AdressRepository;
import com.cybertek.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class DataGenerator implements CommandLineRunner {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    AdressRepository adressRepository;


    @Override
    public void run(String... args) throws Exception {
        Person p1 = new Person("Mike","Smith");
        Person p2 = new Person("ozzy","Kmith");
        Person p3 = new Person("Baha","Smse");

        Adress a1 = new Adress("King St", "22042");
        Adress a2 = new Adress("Elm St", "22035");
        Adress a3 = new Adress("Java St", "22036");

        personRepository.save(p1);
        personRepository.save(p2);
        personRepository.save(p3);
        personRepository.save(p3);


        a1.setPerson(p1);
        a2.setPerson(p1);
        a3.setPerson(p1);z


        adressRepository.save(a1);
        adressRepository.save(a2);
        adressRepository.save(a3);

    }
}
