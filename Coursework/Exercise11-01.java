package com.example.java;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        double[] doubleArray = new double[99];
        double sum = 0.0;
        for (int i = 0; i < doubleArray.length; i++) {
            double rndm = Math.random();
            doubleArray[i] = 100 * rndm;
        }
        for (double j : doubleArray) {
            sum += j;
        }

        double averageValue = sum / 99;
        System.out.println(averageValue);

        Arrays.sort(doubleArray);
        System.out.println(doubleArray[49]);

        for (int k = 8; k < doubleArray.length; k = k + 9) {
            System.out.println(doubleArray[k]);
        }



    }
}
