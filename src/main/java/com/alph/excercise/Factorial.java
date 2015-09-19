package com.alph.excercise;

/**
 courtesy http://codingbat.com/prob/p154669

 Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1. Compute the result recursively (without loops).

 factorial(1) → 1
 factorial(2) → 2
 factorial(3) → 6
 */
public class Factorial {
 public int calculateFactorial(int n) {
  return n <= 1 ? 1 : n * calculateFactorial(n - 1);
 }

 public static void main(String[] args) {
  System.out.println(new Factorial().calculateFactorial(3));
 }
}
