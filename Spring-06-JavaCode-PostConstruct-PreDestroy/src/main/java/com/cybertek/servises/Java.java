package com.cybertek.servises;

import com.cybertek.interfaces.Course;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Java implements Course {


    @Override
    public void teachingHours() {

        System.out.println("teaching hours is 30");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("Executing post construct");
    }

    @PreDestroy
    public void predestroy(){
        System.out.println("Executing predestroy");
    }

}
