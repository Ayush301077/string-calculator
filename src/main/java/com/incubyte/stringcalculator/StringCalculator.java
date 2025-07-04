package com.incubyte.stringcalculator;
import java.util.regex.*;

public class StringCalculator {
    private int callCount = 0;

    public int Add(String numbers) {
        callCount++;
        if (numbers.isEmpty()) {
            return 0;
        }
        String delimiter = ",|\n";
        String nums = numbers;
        if (numbers.startsWith("//[")) {
            int endIndex = numbers.indexOf("]\n");
            delimiter = Pattern.quote(numbers.substring(3, endIndex));
            nums = numbers.substring(endIndex + 2);
        } else if (numbers.startsWith("//")) {
            delimiter = Character.toString(numbers.charAt(2));
            nums = numbers.substring(4);
        }
        String[] numArray = nums.split(delimiter);
        int sum = 0;
        StringBuilder negatives = new StringBuilder();
        for (String num : numArray) {
            if (num.isEmpty()) continue;
            int value = Integer.parseInt(num);
            if (value < 0) {
                if (negatives.length() > 0) negatives.append(",");
                negatives.append(value);
            } else if (value <= 1000) {
                sum += value;
            }
        }
        if (negatives.length() > 0) {
            throw new IllegalArgumentException("negatives not allowed: " + negatives);
        }
        return sum;
    }

    public int GetCalledCount() {
        return callCount;
    }

}
