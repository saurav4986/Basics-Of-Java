package com.bridgelabz.Day2Problems;

import java.util.Scanner;

public class ReverseNumberExample2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to reverse: ");
        int number = scanner.nextInt(), reverse = 0;
//we have not mentioned the initialization part of the for loop
        for( ;number != 0; number=number/10)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
        }
        System.out.println("The reverse of the given number is: " + reverse);
    }
}
