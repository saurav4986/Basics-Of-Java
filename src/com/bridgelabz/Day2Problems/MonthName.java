package com.bridgelabz.Day2Problems;

import java.util.Scanner;

public class MonthName {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int month = scanner.nextInt();

        switch (month) {
            case 1 -> System.out.println("Showing Month: January");
            case 2 -> System.out.println("Showing Month: February");
            case 3 -> System.out.println("Showing Month: March");
            case 4 -> System.out.println("Showing Month: April");
            case 5 -> System.out.println("Showing Month: May");
            case 6 -> System.out.println("Showing Month: June");
            case 7 -> System.out.println("Showing Month: July");
            case 8 -> System.out.println("Showing Month: August");
            case 9 -> System.out.println("Showing Month: September");
            case 10 -> System.out.println("Showing Month: October");
            case 11 -> System.out.println("Showing Month: November");
            case 12 -> System.out.println("Showing Month: December");
            default -> System.out.println("Invalid input - Wrong month number.");
        }
    }
}
