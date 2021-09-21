package com.cybertek.test;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @BeforeEach
    void setUp() {

        System.out.println("This comes from before each");
    }

    @AfterEach
    void tearDown() {
        System.out.println("After each tear down");
    }

    @Test
    void add() {
        System.out.println("add");
        int actual = Calculator.add(2,3);
        assertEquals(5,actual);
    }

    @Test
    void testcase(){
        System.out.println("testcase");
        assertArrayEquals(new int []{1,2,3}, new int[]{1,2,3});
    }

    @Test
    void testcaseNotNull(){
        System.out.println("notnull");
        String nullString = null;
        String notNullString = "Cybertek";

        assertNotNull(notNullString);
    }

    @Test
    void testAssertNotSame(){
        System.out.println("notsame");
       Calculator c1 =new Calculator();
       Calculator c3 =new Calculator();
       Calculator c2 = c1;


       assertNotSame(c1,c3);
       assertSame(c1,c2);
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println(" Before All");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After all");
    }
}