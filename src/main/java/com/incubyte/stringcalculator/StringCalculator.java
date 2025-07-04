package com.incubyte.stringcalculator;

public class StringCalculator {
    public int Add(String numbers) {
    if (numbers.isEmpty()) {
        return 0;
    }
    if (numbers.contains(",")) {
        String[] nums = numbers.split(",");
        return Integer.parseInt(nums[0]) + Integer.parseInt(nums[1]);
    }
    return Integer.parseInt(numbers);
}
}
