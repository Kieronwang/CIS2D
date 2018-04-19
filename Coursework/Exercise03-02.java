package com.example.java;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.text.NumberFormat;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Please enter test scores that range from 0 to 100.");
        System.out.println("To end the program enter 999.");
        System.out.println();  // print a blank line

        int scoreTotal = 0;
        int scoreCount = 0;
        int testScore = 0;
        Scanner sc = new Scanner(System.in);
        List<Integer> numberList = new ArrayList<Integer>();

        while (testScore != 999)
        {
            System.out.print("Enter score: ");
            testScore = sc.nextInt();

            if (testScore <= 100)
            {
                scoreCount += 1;
                scoreTotal += testScore;
                numberList.add(testScore);
            }
            else if (testScore != 999)
                System.out.println("Invalid entry, not counted");
        }

        int max = Collections.max(numberList);
        int min = Collections.min(numberList);

        double newTotal = scoreTotal;
        double newCount = scoreCount;
        double newAverage = newTotal / newCount;

        NumberFormat number = NumberFormat.getNumberInstance();
        number.setMaximumFractionDigits(1);
        String newAverageString = number.format(newAverage);

        String message = "\n" +
                "Score count:   " + newCount + "\n"
                + "Score total:   " + newTotal + "\n"
                + "Average score: " + newAverageString + "\n";
        System.out.println(message);
        System.out.println("Highest score: " + max);
        System.out.println("Lowest score: " + min);

    }
}
