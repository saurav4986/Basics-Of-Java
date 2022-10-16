package com.bridgelabz.Day2Problems;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A");
        int a = sc.nextInt();
        System.out.println("Enter the value of B");
        int b = sc.nextInt();
        System.out.println("Enter the value of C");
        int c = sc.nextInt();

        int p = a+b*c;
        float q = c+a/b;
        float r = a%b+c;
        float s = a*b+c;

        if(p>q && p>r && p>s) {
            System.out.println(p + " is biggest number");

        }else if(q>p && q>r && q>s) {
            System.out.println(q + " is biggest number");
        }else if(r>p && r>q && r>s) {
            System.out.println(r + " is biggest number");
        }else
            System.out.println(s + " is the biggest");
    }
}
