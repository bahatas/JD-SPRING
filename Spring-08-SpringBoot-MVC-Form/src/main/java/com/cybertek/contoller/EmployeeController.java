package com.cybertek.contoller;


import com.cybertek.dataGenerator.DataGenerator;
import com.cybertek.model.Employee;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Arrays;


@Controller
@RequestMapping("/employee")
public class EmployeeController {

//    @GetMapping("/create")
   @RequestMapping(value = "/create",method = RequestMethod.GET)
    public String createEmployee(Model model){


        model.addAttribute("employeeAttribute",new Employee());
        model.addAttribute("stateListAttribute", DataGenerator.getStateList());

        System.out.println("Employee creator");
        return "employee/employee-creator";


    }

    @PostMapping("/show")
    public String show(@ModelAttribute("employeeAttribute") Employee employee,Model model){


       model.addAttribute("employeeList", Arrays.asList(employee));
       //model.addAttribute("age",employee.ageCalculator());

        int birthyear = LocalDate.parse(employee.getBirthday()).getYear();
        model.addAttribute("age",LocalDate.now().getYear()-birthyear);



        return "employee/employee-show";
    }
}
