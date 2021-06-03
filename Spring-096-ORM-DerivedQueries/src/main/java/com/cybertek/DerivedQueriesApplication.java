package com.cybertek;

import com.cybertek.repository.EmployeeRepository;
import com.cybertek.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class DerivedQueriesApplication {

    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    RegionRepository regionRepository;

    public static void main(String[] args) {
        SpringApplication.run(DerivedQueriesApplication.class, args);
    }

    @PostConstruct
    public void testRegions() {
        System.out.println("--------------Regions Start------------");
        System.out.println("regionRepository.findByCountry(\"Canada\") = " + regionRepository.findByCountry("Canada"));

        System.out.println("--------------Regions End------------");
    }

    @PostConstruct
    public void testEmployee() {
        System.out.println("--------------Employee Start------------");

        // employeeRepository.findEmployeesByEmail("amcnee1@google.es");


        System.out.println("--------------Employee End------------");
    }
}
