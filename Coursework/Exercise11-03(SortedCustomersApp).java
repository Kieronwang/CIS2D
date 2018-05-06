package com.example.java;

import java.util.Arrays;

public class SortedCustomersApp
{
    public static void main(String[] args)
    {
        Customer[] customers = new Customer[3];
        customers[0] = new Customer("hello@gmail.com", "Chris", "James");
        customers[1] = new Customer("something@gmail.com", "Evan", "Jones");
        customers[2] = new Customer("abcdefgh@gmail.com", "Matt", "Smith");
        Arrays.sort(customers);
        for (Customer i : customers) {
            System.out.println("email: " + i.getEmail());
            System.out.println("last name: " + i.getLastName());
            System.out.println("first name: " + i.getFirstName());
        }
    }
}
