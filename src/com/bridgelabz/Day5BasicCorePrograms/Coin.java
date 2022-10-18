package com.bridgelabz.Day5BasicCorePrograms;

import java.util.Random;
import java.util.Scanner;

public class Coin {
    static int heads;
    static int tails;

    public static void main(String[] args) {
        System.out.println("Enter the number of time to flip the coin: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for (int i = 0; i < input; i++) {

            Random r = new Random();
            double num = r.nextDouble(0, 1);
            // System.out.println(num);
            if (num < 0.5) {
                System.out.println("The coin turn on tail");
                tails++;
            } else {
                System.out.println("the coin turns on heads");
                heads++;
            }

        }

        System.out.println("Percentage of heads: " + heads * 100 / input);
        System.out.println("Percentage of tails: " + (tails * 100 / input));
        sc.close();
    }
}
