package com.cybertek;

import org.springframework.stereotype.Component;

import java.util.Arrays;



@Component
public class UnitTestingImpl {

    public int calculationSum(int [] data ){



        int sum = Arrays.stream(data).sum();
        return sum;
    }


}
