package com.cybertek.repository;

import com.cybertek.entity.Department;
import com.cybertek.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department, String> {

// Display all the departments in the Furniture department
    List<Department> findByDepartment ( String department);

    // Display all the departments in the Health Devision
    List<Department> findByDivision(String division);

    List<Department> findByDivisionIs ( String Division);

    List<Department> findByDivisionEquals(String divison);


    // Display all the departmenats with the division name ends with 'ics

    List<Department> findByDepartmentEndingWith ( String endWith);

    //Display top 3 departments with division name includes 'Hea', without dublicates
    List<Department> findDistinctTop3ByDepartment(String country);


}
