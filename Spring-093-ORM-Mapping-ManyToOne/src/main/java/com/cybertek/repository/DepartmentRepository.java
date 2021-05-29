package com.cybertek.repository;

import com.cybertek.entity.Department;
import com.cybertek.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {
    
}
