package com.cybertek.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void add() {
        int actual = Calculator.add(2,3);
        assertEquals(5,actual);
    }

    @Test
    void testcase(){
        assertArrayEquals(new int []{1,2,3}, new int[]{1,2,3});
    }

    @Test
    void testcaseNotNull(){
        String nullString = null;
        String notNullString = "Cybertek";

        assertNotNull(notNullString);
    }
}