package com.bridgelabz.Day2Problems;

import java.util.Scanner;

public class PlaceValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number upto 4-digit: ");
        int n = scanner.nextInt();
        int th,h,t,u;  // Thousands,hundreds,tens,units

        u=n%10;
        t=(n/10)%10;
        h=(n/100)%10;
        th=n/1000;
        System.out.printf("Thousands = %d , Hundreds = %d , Tens = %d , Units = %d\n",th,h,t,u);

    }
}
