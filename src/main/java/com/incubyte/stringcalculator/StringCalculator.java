package com.incubyte.stringcalculator;
import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;

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
            int delimiterEnd = numbers.indexOf("\n");
            String delimiterSection = numbers.substring(2, delimiterEnd);
            List<String> delimiters = new ArrayList<>();
            Matcher m = Pattern.compile("\\[(.*?)]").matcher(delimiterSection);
            while (m.find()) {
                delimiters.add(Pattern.quote(m.group(1)));
            }
            delimiter = String.join("|", delimiters);
            nums = numbers.substring(delimiterEnd + 1);
        } else if (numbers.startsWith("//")) {
            delimiter = Pattern.quote(Character.toString(numbers.charAt(2)));
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
