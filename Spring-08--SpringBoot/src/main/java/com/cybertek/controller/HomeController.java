package com.cybertek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
 // here we have  3 income request
    @RequestMapping("/")
    public String getRequestMapping(){
        return "home";
    }

    @RequestMapping("/baha")
    public String getRequestMapping2(){
        return "home";
    }

    @RequestMapping("/cybertek")
    public String getRequestMapping3(){
        return "home";
    }
}
