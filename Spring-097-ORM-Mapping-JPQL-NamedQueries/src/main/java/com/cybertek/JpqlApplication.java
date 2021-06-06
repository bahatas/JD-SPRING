package com.cybertek;

import com.cybertek.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class JpqlApplication {


    @Autowired
    EmployeeRepository employeeRepository;


    public static void main(String[] args) {
        SpringApplication.run(JpqlApplication.class, args);
    }

    @PostConstruct
    public void testEmployee(){

        System.out.println("employeeRepository.getEmployeeDetail() = " + employeeRepository.getEmployeeDetail());

        System.out.println("employeeRepository.getEmployeeSalary(\"dtrail8@tamu.edu\") = " + employeeRepository.getEmployeeSalary("dtrail8@tamu.edu"));

        System.out.println("employeeRepository.getEmployeeSalary() = " + employeeRepository.getEmployeeSalary());

        System.out.println("employeeRepository.readEmployeeBySalary(100000) = " + employeeRepository.readEmployeeBySalary(100000));


        System.out.println("employeeRepository.getEmployeeByEmailIsNotNull() = " + employeeRepository.getEmployeeByEmailIsNotNull().toString());

        System.out.println("employeeRepository.getEmployeeOrderBySalary() = " + employeeRepository.getEmployeeOrderBySalary());

        System.out.println("employeeRepository.getEmployeeByEmailAndSalary(\"amcnee1@google.es\",56752) = " + employeeRepository.getEmployeeByEmailAndSalary("amcnee1@google.es",56752));
    }
}
