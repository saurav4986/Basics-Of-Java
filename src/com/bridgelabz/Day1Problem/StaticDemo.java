package com.bridgelabz.Day1Problem;

public class StaticDemo {

   static int x = 10;
   static int y;

   static void func(int z) {
      System.out.println("Inside static method \n");
      System.out.println("x = " + x);
      System.out.println("y = " + y);
      System.out.println("z = " + z);
   }

   static {
      System.out.println("Running static initialization block.\n");
      y = x + 5;
   }

   public static void main(String[] args) {
      System.out.println("Inside main()\n");
      func(8);
   }
}