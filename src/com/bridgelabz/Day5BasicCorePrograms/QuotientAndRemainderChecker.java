package com.bridgelabz.Day5BasicCorePrograms;

import java.util.Scanner;

public class QuotientAndRemainderChecker {
    public static void main(String[] args) {
        System.out.println("Enter the 1st number/Dividend: ");
        Scanner sc = new Scanner(System.in);
        int dividend = sc.nextInt();

        System.out.println("Enter the 2nd number/Divisor: ");
        Scanner sc1 = new Scanner(System.in);
        int divisor = sc1.nextInt();

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("quotient=" + quotient);
        System.out.println("remainder=" + remainder);
        sc.close();
        sc1.close();
    }
}
