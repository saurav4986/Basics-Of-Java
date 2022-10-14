package com.bridgelabz.Day2Problems;

import java.util.Scanner;
public class CheckVowel{
    public static void main(String[] args){
        char ch;//variable declaration
        boolean isVowel=false;//Declare a boolean variable

        Scanner scan=new Scanner(System.in);
        //create a scanner object for input

        System.out.println("Enter the character : ");
        ch=scan.next().charAt(0);// store the input from the user

        switch (ch) {
            //check lower case vowel letters
            //check upper case vowel letters
            case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> isVowel = true;
        }

        if(isVowel){
            System.out.println(ch+" is a vowel");
        }
        else{ if((ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' )){
            System.out.println(ch+" is a consonant");
        }
        else{
            System.out.println(ch+" is not a Alphabets");
        }
        }

    }

}
