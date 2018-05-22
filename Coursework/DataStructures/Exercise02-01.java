package com.example.java;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //initialize a list of the first 10 numbers in the Fibonacci sequence
        List<Integer> list1 = Arrays.asList(1,1,2,3,5,8,13,21,34,55);
        System.out.println("position of 21: " + Collections.binarySearch(list1,21));



    }

}
