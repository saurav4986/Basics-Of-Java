package com.bridgelabz.Day2Problems;

import java.util.Scanner;

public class SumOfNaturalNumber2 {
    static int naturalNumberSum(int n)
    {
        int sum = 0;
//executes until the condition becomes false
        for (int i = 1; i <= n; i++)
//adding the value of i to the sum variable
            sum = sum + i;
        return sum;
    }
    //main method
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = scanner.nextInt();
//calling method and prints the sum
        System.out.println("Sum of Natural Numbers is: "+naturalNumberSum(n));
    }
}
