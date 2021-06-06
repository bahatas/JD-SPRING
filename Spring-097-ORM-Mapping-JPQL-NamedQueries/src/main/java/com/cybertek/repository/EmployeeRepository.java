package com.cybertek.repository;

import com.cybertek.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    @Query("SELECT e from Employee e WHERE e.email = 'dtrail8@tamu.edu'")
    Employee getEmployee();

    @Query("SELECT e.salary FROM Employee e WHERE e.email = 'dtrail8@tamu.edu'")
    Integer getEmployeeSalary();

    @Query("SELECT e.salary FROM Employee e WHERE e.email = 'email'")
    Integer getEmployeeSalary(String email);


}
