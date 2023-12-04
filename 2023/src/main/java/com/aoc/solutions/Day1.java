package com.aoc.solutions;

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
            if (!(row.matches("^[0-9].*") && row.matches(".*[0-9]$")) && row.length() >= 3) {
                System.out.println(row);
                row = row.replaceAll("oneight", "oneeight");
                row = row.replaceAll("fiveight", "fiveeight");
                row = row.replaceAll("eightwo", "eighttwo");
                row = row.replaceAll("nineight", "nineeight");
                row = row.replaceAll("sevenine", "sevennine");
                row = row.replaceAll("threeight", "threeeight");
                row = row.replaceAll("eighthree", "eightthree");
                row = row.replaceAll("twone", "twoone");

                for (String numb : spelledNumbs) {
                    do {
                        row = row.replaceFirst(numb, Integer.toString(spelledNumbs.indexOf(numb) + 1));
                        System.out.println(row);
                    } while (row.contains(numb));
                }
            }

            // remove letters from String
            row = row.replaceAll("[^0-9]", "");
            System.out.println(row);
            String first = row.substring(0, 1);
            String last = row.substring(row.length() - 1);
            System.out.println(first);
            System.out.println(last);
            int number = Integer.parseInt(first + last);
            sum += number;
        }
        result = Integer.toString(sum);
        return result;
    }
}