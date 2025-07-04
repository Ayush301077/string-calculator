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

    @Test
    void customDelimiterIsUsed() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.Add("//;\n1;2");
        System.out.println("Sum: " + result);
        assertEquals(3, result);
    }

    @Test
    void shouldThrowExceptionForNegativeNumbers() {
        StringCalculator calculator = new StringCalculator();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.Add("1,-2,3");
        });
        System.out.println("Exception message: " + exception.getMessage());
        assertTrue(exception.getMessage().contains("negatives not allowed"));
    }

    @Test
    void shouldListAllNegativesInExceptionMessage() {
        StringCalculator calculator = new StringCalculator();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.Add("1,-2,-3,4");
        });
        System.out.println("Exception message: " + exception.getMessage());
        assertTrue(exception.getMessage().contains("negatives not allowed"));
        assertTrue(exception.getMessage().contains("-2"));
        assertTrue(exception.getMessage().contains("-3"));
    }

    @Test
    void numberOfTimesAddWasCalled() {
        StringCalculator calculator = new StringCalculator();
        calculator.Add("1,2");
        calculator.Add("3");
        int count = calculator.GetCalledCount();
        System.out.println("Add called: " + count + " times");
        assertEquals(2, count);
    }

    @Test
    void numbersGreaterThanThousandAreIgnored() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.Add("2,1001");
        System.out.println("Sum: " + result);
        assertEquals(2, result);
    }
}