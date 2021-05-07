package com.cybertek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {
 // here we have  3 income request
    @RequestMapping("/")
    public String getRequestMapping(){
        return "home";
    }

//    @RequestMapping("/baha")
//    public String getRequestMapping2(){
//        return "home";
//    }


    @RequestMapping( method= RequestMethod.GET,value = "/baha")
    public String getRequestMapping2(){
        return "home";
    }

    @RequestMapping( method = RequestMethod.GET,value= "/cybertek")
    public String getRequestMapping3(){
        return "home";
    }

    @GetMapping("/spring")
    public String getMappingEx(){
        return "home";
    }

    @PostMapping ("/spring")
    public String getMappingEx2(){
        return "home";
    }

    @GetMapping("/home/{name}")
    public String pathVariableEx(@PathVariable("name") String name){

        System.out.println("name = " + name);
        return "home";
    }

    @GetMapping("/home/{name}/{email}")
    public String pathVariableEx(@PathVariable("name") String name,@PathVariable("email") String email){


        System.out.println("name = " + name);
        System.out.println("email = " + email);
        return "home";
    }


    @GetMapping("/home/course")
    public String requestParamEx(@RequestParam("course") String course){

        System.out.println("course = " + course);
        return "home";
    }

    @GetMapping(value = "/course")
    public String requestParamEx2(@RequestParam(value = "name",required = false,defaultValue = "cybertek") String name){

        System.out.println("name = " + name);
        return "home";
    }

}
