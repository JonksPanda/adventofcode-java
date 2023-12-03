package com.aoc.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day1 extends Solution {

    public Day1() {
        super("day1.txt", "day 1");
        // TODO Auto-generated constructor stub
    }

    @Override
    public String solution1() {
        String result = "";
        int sum = 0;

        for (String row : this.input.getRowsList()) {
            // removes all letters from row
            row = row.replaceAll("[^0-9]", "");
            // gets first letter from row
            String first = row.substring(0, 1);
            // gets last letter from row
            String last = row.substring(row.length() - 1);
            int number = Integer.parseInt(first + last);
            sum += number;
        }
        result = Integer.toString(sum);
        return result;
    }

    @Override
    public String solution2() {
        String result = "";
        int sum = 0;
        // get matching number with n - 1 (eg. spelledNumbs[1 - 1] = "one")
        List<String> spelledNumbs = Arrays.asList("one", "two", "three", "four", "five", "six", "seven", "eight",
                "nine");

        for (String row : this.input.getRowsList()) {
            // Loops through string letter by letter and checks for match
            String[] subStrings = row.split("");
            String iteratedString = "";
            System.out.println(row);
            for (String character : subStrings) {

            }
            System.out.println(row);

            // remove letters from String
            row = row.replaceAll("[^0-9]", "");
            String first = row.substring(0, 1);
            String last = row.substring(row.length() - 1);
            int number = Integer.parseInt(first + last);
            sum += number;
        }
        result = Integer.toString(sum);
        return result;
    }
}