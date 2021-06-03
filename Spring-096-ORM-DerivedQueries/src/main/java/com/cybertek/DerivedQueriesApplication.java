package com.cybertek;

import com.cybertek.repository.DepartmentRepository;
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

    @Autowired
    DepartmentRepository departmentRepository;

    public static void main(String[] args) {
        SpringApplication.run(DerivedQueriesApplication.class, args);
    }

    @PostConstruct
    public void testRegions() {
        System.out.println("--------------Regions Start------------");
        System.out.println("regionRepository.findByCountry(\"Canada\") = " + regionRepository.findByCountry("Canada"));

        System.out.println("regionRepository.findDistinctByCountry(\"Canada\") = " + regionRepository.findDistinctByCountry("Canada"));

        System.out.println("regionRepository.findByCountryContaining(\"United\") = " + regionRepository.findByCountryContaining("United"));

        System.out.println("regionRepository.findByCountryContainingOrderByCountry(\"United\") = " + regionRepository.findByCountryContainingOrderByCountry("United"));

        System.out.println("regionRepository.findTop2ByCountry(\"Canada\") = " + regionRepository.findTop2ByCountry("Canada"));

        System.out.println("--------------Regions End------------");
    }

    @PostConstruct
    public void testEmployee() {
        System.out.println("--------------Employee Start------------");

        System.out.println("employeeRepository.findByEmail(\"ssymonds2@hhs.gov\") = " + employeeRepository.findByEmail("ssymonds2@hhs.gov"));
        System.out.println("employeeRepository.findByFirstNameAndLastNameOrEmail(\"Jodi\",\"Hook\",\"jhookd@booking.com\") = " + employeeRepository.findByFirstNameAndLastNameOrEmail("Jodi", "Hook", "jhookd@booking.com"));


        System.out.println("--------------Employee End------------");
    }

    @PostConstruct
    public void testDepartment() {
        System.out.println("--------------Department Start------------");

        System.out.println("departmentRepository.findByDepartment(\"Furniture\") = " + departmentRepository.findByDepartment("Furniture"));
        System.out.println("departmentRepository.findByDivision(\"Home\") = " + departmentRepository.findByDivision("Home"));

        System.out.println("departmentRepository.findByDivisionIs(\"OutDoors\") = " + departmentRepository.findByDivisionIs("OutDoors"));
        System.out.println("departmentRepository.findByDepartmentEndingWith(\"ics\") = " + departmentRepository.findByDepartmentEndingWith("ics"));
        System.out.println("departmentRepository.findDistinctTop3ByDepartment(\"Hea\") = " + departmentRepository.findDistinctTop3ByDepartment("Hea"));

        System.out.println("--------------Department End------------");
    }
}
