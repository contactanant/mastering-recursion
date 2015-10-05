package com.alph.excercise;

/**

 Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.

 countHi("xxhixx") → 1
 countHi("xhixhix") → 2
 countHi("hi") → 1

 */
public class CountHi {
    public int calculate(String str) {
        if (str == null || str.length() < 2)
            return 0;

        return "hi".equals(str.substring(0,2)) ? 1 + calculate(str.substring(2)) : calculate(str.substring(1));
    }

    public static void main(String[] args) {
        System.out.println(new CountHi().calculate("xxhixx"));
        System.out.println(new CountHi().calculate("xhixhix"));
        System.out.println(new CountHi().calculate("hi"));
        System.out.println(new CountHi().calculate("a"));
    }
}
