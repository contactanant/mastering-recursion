package com.alph.excercise;

/**
 Given a non-negative int n, return the sum of its digits recursively (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

 sumDigits(126) → 9
 sumDigits(49) → 13
 sumDigits(12) → 3

 */
public class SimDigit {
  public int calculate(int number) {
      return number < 10 ? number : calculate(number / 10) + calculate(number % 10);
  }

 public static void main(String[] args) {
  System.out.println(new SimDigit().calculate(126));
  System.out.println(new SimDigit().calculate(49));
  System.out.println(new SimDigit().calculate(300));
 }
}
