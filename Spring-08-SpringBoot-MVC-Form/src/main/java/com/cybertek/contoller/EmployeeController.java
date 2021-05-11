package com.cybertek.contoller;


import com.cybertek.model.Employee;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/employee")
public class EmployeeController {

    //@GetMapping("/create")
    @RequestMapping(value = "/create",method = RequestMethod.GET)
    public String createEmployee(Model model){

        model.addAttribute("employeeAttribute",new Employee());

        System.out.println("Employee creator");
        return "employee/employee-creator";


    }

    @PostMapping("/show")
    public String show(@ModelAttribute("employeeAttribute") Employee employee){


        return "employee/employee-show";
    }
}
