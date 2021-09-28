package com.cybertek;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import static org.junit.jupiter.api.Assertions.*;

class UnitTestingImplTest {





    @org.jetbrains.annotations.NotNull
    @org.jetbrains.annotations.Contract(value = " -> new", pure = true)
    public static UnitTestingImpl unitTesting(){
        return new UnitTestingImpl();
    }
    //  unitTesting = new UnitTestingImpl();

    @Test
    void calculationSum() {


        int i = unitTesting().calculationSum(new int[]{1, 2, 3});
        assertEquals(6,i);
    }
}