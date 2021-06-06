package com.cybertek.repository;

import com.cybertek.entity.Employee;
import org.hibernate.boot.model.source.spi.EmbeddableMapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    @Query("SELECT e from Employee e WHERE e.email = 'dtrail8@tamu.edu'")
    Employee getEmployeeDetail();

    @Query("SELECT e.salary FROM Employee e WHERE e.email = 'dtrail8@tamu.edu'")
    Integer getEmployeeSalary();

    @Query("SELECT e.salary FROM Employee e WHERE e.email = 'email'")
    Integer getEmployeeSalary(String email);

    //single bind parameter
    @Query("SELECT e FROM Employee e WHERE e.email=?1 ")
    Optional<Employee> getEmployeeByEmail(String email);

    //multiple bind parameter
    @Query("SELECT e FROM Employee e WHERE e.email=?1 and e.salary=?2")
    Employee getEmployeeByEmailAndSalary(String email, int salary);

    //single named parameter
    @Query("SELECT e from Employee e where e.salary=:salary")
    Employee getEmployeeBySalary(@Param("salary") int salary);


    //multiple named paraameter
    @Query("SELECT e from Employee e Where e.salary=:salary OR e.firstName=:firstname")
    Employee getEmployeeByFirstNameOrSalary(@Param("salary") int salary, @Param("firstname") String firstname);

    //Not Equal
    @Query("Select e from Employee e Where e.salary <> ?1")
    List<Employee> getEmployeeBySalaryNotEqual(int salary);

    //Like / containds // startwith / Endwith

    @Query("SELECT e from Employee e where e.firstName LIKE ?1")
    List<Employee> getEmployeeByFirstNameLike();

    // Lesss than
    @Query("Select e from Employee e Where e.salary< ?1")
    List<Employee> getEmployeeBySalaryLessThan();

    //Greater than
    @Query("Select e from Employee e Where e.salary> ?1")
    List<Employee> getEmployeeBySalaryGreaterThan();

    //
}
