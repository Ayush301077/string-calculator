package com.incubyte.stringcalculator;

public class StringCalculator {
    public int Add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        String delimiter = ",|\n";
        String nums = numbers;
        if (numbers.startsWith("//")) {
            delimiter = Character.toString(numbers.charAt(2));
            nums = numbers.substring(4);
        }
        String[] numArray = nums.split(delimiter);
        int sum = 0;
        for (String num : numArray) {
            int value = Integer.parseInt(num);
            if (value < 0) {
                throw new IllegalArgumentException("negatives not allowed: " + value);
            }
            sum += value;
        }
        return sum;
    }

}
