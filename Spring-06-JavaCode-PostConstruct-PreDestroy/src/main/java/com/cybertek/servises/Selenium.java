package com.cybertek.servises;

import com.cybertek.interfaces.Course;
import org.springframework.stereotype.Component;

@Component
public class Selenium implements Course {


    @Override
    public void teachingHours() {
        System.out.println("Teaching hour is 20");
    }
}
