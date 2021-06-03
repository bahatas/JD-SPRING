package com.cybertek.repository;

import com.cybertek.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    //display all employees with email adress
    List<Employee> findByEmail(String email);

    //Display all employees with first name '' and lastname '', also show all employees with a email adress ''

    List<Employee> findByFirstNameAndLastNameOrEmail (String firstName, String lastName,String email);

    //Display all employeees that first name is not ''
    List<Employee> findByFirstNameIsNot(String firstnameisnot);

    //Display all emplyees last name  starts with ''
    List<Employee> findByLastNameStartingWith ( String pattern);

    //Displpay all employees with salaries less than ''
    List<Employee> findBySalaryLessThan(Double salary);

    //Display all employees that has been hired between '' and ''
    List<Employee> findByHireDateBetween(LocalDate startDate, LocalDate endDate);



    // Display all employees where salaries greater and equal to '' in order
    List<Employee> findBySalaryIsGreaterThanEqualOrderBySalaryDesc(Integer salary);

    //Display all employees that do not have email adress
    List<Employee> findByEmailIsNull();




}
