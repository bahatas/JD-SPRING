package com.cybertek.contoller;


import com.cybertek.model.Employee;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping("/create")
    public String createEmployee(Model model){

        model.addAttribute("employeeAttribute",new Employee());

        return "/employee/employee-creater";


    }

    @PostMapping("/show")
    public String show(@ModelAttribute("employeeAttribute") Employee employee){


        return "employee/employee-show";
    }
}
