package com.alph.excercise;

/**

 Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.
 countX("xxhixx") → 4
 countX("xhixhix") → 3
 countX("hi") → 0

 */
public class CountX {
    public int calculate(String str) {
        if (str == null || str.length() == 0)
            return 0;
        if ("x".equals(str.substring(0,1))) return 1 + calculate(str.substring(1));

        return calculate(str.substring(1));
    }

    public static void main(String[] args) {
        System.out.println(new CountX().calculate("xxhixx"));
        System.out.println(new CountX().calculate("xhixhix"));
        System.out.println(new CountX().calculate("hi"));
        System.out.println(new CountX().calculate("a"));
    }
}
