package com.cybertek.spring130unitttestingjunit5.test;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void add() {
        int actual = Calculator.add(2, 3);

        assertEquals(5, actual);
    }

    @Test
    public void  test1(){

        //fail("Todo");
    }
}