package com.cybertek;

import com.cybertek.calculator.Calculator;
import com.cybertek.enums.City;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class LabApplication {

    public static void main(String[] args) throws Exception {
       ApplicationContext container = SpringApplication.run(LabApplication.class, args);
        Calculator calculator = container.getBean("calculator", Calculator.class);

        System.out.println("calculator.getTotalCarpetCost(City.ARLINGTON) = " + calculator.getTotalCarpetCost(City.ARLINGTON));
    }

}

