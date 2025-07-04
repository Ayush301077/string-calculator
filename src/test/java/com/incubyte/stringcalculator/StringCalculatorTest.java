package com.incubyte.stringcalculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {
    @Test
    void shouldReturnZeroForEmptyString() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(0, calculator.Add(""));
    }

   @Test
    void shouldReturnNumberForSingleNumber() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.Add("1");
        System.out.println("Sum: " + result); 
        assertEquals(1, result);
    }

    @Test
    void shouldReturnSumForTwoNumbers() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.Add("1,2");
        System.out.println("Sum: " + result); 
        assertEquals(3, result);
    }

    @Test
    void shouldReturnSumForMultipleNumbers() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.Add("1,2,3,4");
        System.out.println("Sum: " + result);
        assertEquals(10, result);
    }

    @Test
    void newLineIsUsedAsDelimiter() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.Add("1\n2,3");
        System.out.println("Sum: " + result);
        assertEquals(6, result);
    }

}