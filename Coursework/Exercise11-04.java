package com.example.java;



public class Main
{
    String[][] cardHands = new String[5][4];

    public static void main(String[] args)
    {
        String[] suits = {"C","D","S","H"};
        String[] ranks = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
        int[] deck = new int[52];
        String[] cards = new String[52];
        String[][] cardHands = new String[4][5];


        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }

        for (int i = 0; i < deck.length; i++) {
            int index = shuffle();
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }

        for (int i = 0; i < deck.length; i++) {
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
            cards[i] = rank + " of " + suit;
            System.out.println("Card number " + deck[i] + ": " + rank + " of " + suit);
        }

        for (int i = 0; i < 5; i++)
        {
            cardHands[0][i] = cards[i];
            cardHands[1][i] = cards[i];
            cardHands[2][i] = cards[i];
            cardHands[3][i] = cards[i];
        }
        System.out.println(cardHands);
    }
    public static int shuffle()
    {
         return (int)(Math.floor(Math.random()*50) + 1);
    }
    
}
