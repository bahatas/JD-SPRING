package com.cybertekmvc.controller;

import com.cybertekmvc.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/welcome")
    public String homePage(Model model) {

        model.addAttribute("text", "This line comes from Controller java class as  text");
        model.addAttribute("name", "Cybertek");
        model.addAttribute("course", "Selenium");

        String subject = "Collections";
        model.addAttribute("subject", subject);

        //create a some radnom students ()0-1000 and show them in your UI

        int studentId = new Random().nextInt(1000);
        model.addAttribute("studentid", studentId);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(42);
        numbers.add(500);
        numbers.add(140);
        numbers.add(700);

        model.addAttribute("numbersArray", numbers);

        //print your birthday
        LocalDate birthday = LocalDate.now().minusYears(34);
        model.addAttribute("birthday", birthday);

        Student student = new Student(1, "Mike", "Smith");
        model.addAttribute("student", student);





        return "student/welcome";
    }

    @GetMapping("/register")
    public String homePage2 () {


        return "student/register";
    }

}
