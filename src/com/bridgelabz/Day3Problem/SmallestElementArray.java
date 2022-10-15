package com.bridgelabz.Day3Problem;

public class SmallestElementArray {
    public static void main(String[] args) {

        //Initialize array
        int [] arr = new int [] {25, 11, 7, 75, 56};
        //Initialize min with first element of array.
        int min = arr[0];
        //Loop through the array
        for (int j : arr) {
            //Compare elements of array with min
            if (j < min)
                min = j;
        }
        System.out.println("Smallest element present in given array: " + min);
    }

}
