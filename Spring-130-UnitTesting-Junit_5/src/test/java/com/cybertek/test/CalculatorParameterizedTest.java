package com.cybertek.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

public class CalculatorParameterizedTest {


    @ParameterizedTest
    @ValueSource(strings = {"java", "Js", "TS"})
    void testCase1(String args) {
        Assertions.assertTrue(!args.isEmpty());
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9})
    void testcase2(int number) {
        Assertions.assertEquals(0, number % 3);
    }


    @ParameterizedTest
    @ValueSource(strings = {"java", "Js", "TS"})
    @NullAndEmptySource
    void testCase3(String args) {
        Assertions.assertTrue(!args.isEmpty());
    }


    @ParameterizedTest
    @MethodSource("stringProvider")
    void testCase4(String arg) {
        Assertions.assertNotNull(arg);

    }
// This onr  created by intellij
//    private static Stream<Arguments> stringProvider() {
//        return null;
//    }


    static String[] stringProvider() {

        String arr[] = {"Java", "JS", "TS"};
        return arr;

    }

    @ParameterizedTest
    @CsvSource(
            {
                    "10,20,30",
                    "20,20,40",
                    "50,50,60"
            }
    )
    void testCase5(int num1, int num2, int result) {

        Assertions.assertEquals(result, Calculator.add(num1, num2));

    }


    @ParameterizedTest
    @CsvFileSource(resources = "/sample-data.csv", numLinesToSkip = 1)
    void testCase6(int num1, int num2, int result) {

        Assertions.assertEquals(result, Calculator.add(num1, num2));

    }

}
