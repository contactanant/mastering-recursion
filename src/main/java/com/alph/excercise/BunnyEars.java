package com.alph.excercise;

/**
 We have a number of bunnies and each bunny has two big floppy ears. We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).

 bunnyEars(0) → 0
 bunnyEars(1) → 2
 bunnyEars(2) → 4
 */
public class BunnyEars {
  public int calculateEars(int numberOfBunnies) {
     return numberOfBunnies == 0 ? 0 : 2 + calculateEars(numberOfBunnies - 1);
  }

 public static void main(String[] args) {
  System.out.println(new BunnyEars().calculateEars(0));
  System.out.println(new BunnyEars().calculateEars(1));
  System.out.println(new BunnyEars().calculateEars(2));
  System.out.println(new BunnyEars().calculateEars(3));
 }
}
