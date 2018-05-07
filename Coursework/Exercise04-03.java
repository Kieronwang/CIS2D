package com.example.java;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int scoreSetSize;
        int scoreSet2Size;
        System.out.print("How many scores will be entered for set 1?: ");
        scoreSetSize = sc.nextInt();
        System.out.print("How many scores will be entered for set 2?: ");
        scoreSet2Size = sc.nextInt();

        // display operational messages
        System.out.println("Please enter test scores that range from 0 to 100.");
        System.out.println("To end the program enter 999.");
        System.out.println();  // print a blank line

        // initialize variables and create a Scanner object
        int scoreTotal = 0;
        int scoreCount = scoreSetSize;
        int testScore = 0;


        System.out.println("SCORE SET 1");
        int j = 0;
        while (j < scoreSetSize) {
            j++;
            System.out.print("Enter score: ");
            testScore = sc.nextInt();

            // accumulate score count and score total
            if (testScore <= 100) {
                scoreCount = scoreCount + 1;
                scoreTotal = scoreTotal + testScore;
            } else if (testScore != 999)
                System.out.println("Invalid entry, not counted");
            scoreCount = scoreCount - 1;
        }

        double averageScore = scoreTotal / scoreCount;
        String message = "\n" +
                "Score count:   " + scoreCount + "\n"
                + "Score total:   " + scoreTotal + "\n"
                + "Average score: " + averageScore + "\n";
        System.out.println(message);

        int scoreTotal2 = 0;
        int scoreCount2 = scoreSet2Size;
        int testScore2 = 0;

        int i = 0;
        System.out.println("SCORE SET 2");
        while (i < scoreSet2Size)
        {
            // get the input from the user
            System.out.print("Enter score: ");
            testScore2 = sc.nextInt();
            i++;

            // accumulate score count and score total
            if (testScore2 <= 100)
            {
                scoreCount = scoreCount + 1;
                scoreTotal2 = scoreTotal2 + testScore2;
            }
            else if (testScore != 999)
            {
                System.out.println("Invalid entry, not counted");
                scoreCount2 = scoreCount2 - 1;
            }

        }
        double averageScore2 = scoreTotal2 / scoreCount2;
        String message2 = "\n" +
                "Score count:   " + scoreCount2 + "\n"
                + "Score total:   " + scoreTotal2 + "\n"
                + "Average score: " + averageScore2 + "\n";
        System.out.println(message2);
    }
}
