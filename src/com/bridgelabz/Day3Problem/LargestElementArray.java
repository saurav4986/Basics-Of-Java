package com.bridgelabz.Day3Problem;

public class LargestElementArray {
    public static void main(String[] args) {

        //Initialize array
        int [] arr = new int [] {25, 11, 7, 75, 156};
        //Initialize max with first element of array.
        int max = arr[0];
        //Loop through the array
        for (int j : arr) {
            //Compare elements of array with max
            if (j > max)
                max = j;
        }
        System.out.println("Largest element present in given array: " + max);
    }
}
