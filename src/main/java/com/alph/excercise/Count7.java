package com.alph.excercise;

/**
 Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2. (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

 count7(717) → 2
 count7(7) → 1
 count7(123) → 0
 */
public class Count7 {
  public int calculate(int number) {
      return number < 10 ? (number == 7 ? 1 : 0) : calculate(number / 10) + calculate(number % 10);
  }

 public static void main(String[] args) {
  System.out.println(new Count7().calculate(1267));
  System.out.println(new Count7().calculate(4977));
  System.out.println(new Count7().calculate(3));
 }
}
