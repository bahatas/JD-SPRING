package com.cybertek.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class EController {

    @RequestMapping("/econtroller")
    public String get(Model model){
        return "mentor/mentor-register";
    }
}
