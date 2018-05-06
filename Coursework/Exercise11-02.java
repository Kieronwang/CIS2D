package com.example.java;
import java.util.*;
import java.text.*;



public class Main
{
    public static void main(String[] args)
    {
        String[][] stringArray = new String [10][4];
        int counter = 0;
        
        // display a welcome message
        System.out.println("Welcome to the Future Value Calculator");
        System.out.println();

        // perform 1 or more calculations
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y"))
        {

            // get the input from the user
            System.out.println("DATA ENTRY");
            double monthlyInvestment = getDoubleWithinRange(sc,
                    "Enter monthly investment: ", 0, 1000);
            double interestRate = getDoubleWithinRange(sc,
                    "Enter yearly interest rate: ", 0, 30);
            int years = getIntWithinRange(sc,
                    "Enter number of years: ", 0, 100);

            // calculate the future value
            double monthlyInterestRate = interestRate/12/100;
            int months = years * 12;
            double futureValue = calculateFutureValue(
                    monthlyInvestment, monthlyInterestRate, months);

            // get the currency and percent formatters
            NumberFormat currency = NumberFormat.getCurrencyInstance();
            NumberFormat percent = NumberFormat.getPercentInstance();
            percent.setMinimumFractionDigits(1);

            // format the result as a single string
            String results =
                    "Monthly investment:\t"
                            + currency.format(monthlyInvestment) + "\n"
                            + "Yearly interest rate:\t"
                            + percent.format(interestRate/100) + "\n"
                            + "Number of years:\t"
                            +  years + "\n"
                            + "Future value:\t\t"
                            + currency.format(futureValue) + "\n";

            // print the results
            System.out.println();
            System.out.println("FORMATTED RESULTS");
            System.out.println(results);

            String formattedMonthlyInvestment = currency.format(monthlyInvestment);
            String formattedInterestRate = currency.format(interestRate);
            String formattedFutureValue = currency.format(futureValue);

            stringArray[counter][0] = formattedMonthlyInvestment;
            stringArray[counter][1] = formattedInterestRate;
            stringArray[counter][2] = Integer.toString(years);
            stringArray[counter][3] = formattedFutureValue;

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            counter++;
            System.out.println();
        }
        System.out.println("Inv/Mo." + "\t" + "Rate " + "Years" + " Future Value");
        for(int i = 0; i < counter; i++)
        {
            for (int j = 0; j < stringArray[i].length; j++)
                System.out.print(stringArray[i][j] + "\t");
            System.out.println("\n");
        }
    }

    public static double getDouble(Scanner sc, String prompt)
    {
        boolean isValid = false;
        double d = 0;
        while (isValid == false)
        {
            System.out.print(prompt);
            if (sc.hasNextDouble())
            {
                d = sc.nextDouble();
                isValid = true;
            }
            else
            {
                System.out.println("Error! Invalid decimal value. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return d;
    }

    public static double getDoubleWithinRange(Scanner sc, String prompt,
                                              double min, double max)
    {
        double d = 0;
        boolean isValid = false;
        while (isValid == false)
        {
            d = getDouble(sc, prompt);
            if (d <= min)
                System.out.println(
                        "Error! Number must be greater than " + min + ".");
            else if (d >= max)
                System.out.println(
                        "Error! Number must be less than " + max + ".");
            else
                isValid = true;
        }
        return d;
    }

    public static int getInt(Scanner sc, String prompt)
    {
        boolean isValidInt = false;
        int i = 0;
        while (isValidInt == false)
        {
            System.out.print(prompt);
            if (sc.hasNextInt())
            {
                i = sc.nextInt();
                isValidInt = true;
            }
            else
            {
                System.out.println("Error! Invalid integer value. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return i;
    }

    public static int getIntWithinRange(Scanner sc, String prompt,
                                        int min, int max)
    {
        int i = 0;
        boolean isValid = false;
        while (isValid == false)
        {
            i = getInt(sc, prompt);
            if (i <= min)
                System.out.println(
                        "Error! Number must be greater than " + min + ".");
            else if (i >= max)
                System.out.println(
                        "Error! Number must be less than " + max + ".");
            else
                isValid = true;
        }
        return i;
    }

    public static double calculateFutureValue(double monthlyInvestment,
                                              double monthlyInterestRate, int months)
    {
        double futureValue = 0;
        for (int i = 1; i <= months; i++)
        {
            futureValue =
                    (futureValue + monthlyInvestment) *
                            (1 + monthlyInterestRate);
        }
        return futureValue;
    }
}
