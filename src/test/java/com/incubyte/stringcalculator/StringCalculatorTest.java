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
        System.out.println("Sum: " + result); // This will print the sum in the output window
        assertEquals(1, result);
    }
}