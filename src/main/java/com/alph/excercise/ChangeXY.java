package com.alph.excercise;

/**
 Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars.

 changeXY("codex") → "codey"
 changeXY("xxhixx") → "yyhiyy"
 changeXY("xhixhix") → "yhiyhiy"

 */
public class ChangeXY {
    public String replace(String str) {
        if (str == null || str.length() < 1)
            return str;

        char firstChar = str.charAt(0);
        return ('x' == firstChar ? 'y' : firstChar) + replace(str.substring(1));
    }

    public static void main(String[] args) {
        System.out.println(new ChangeXY().replace("codex"));
        System.out.println(new ChangeXY().replace("xxhixx"));
        System.out.println(new ChangeXY().replace("xhixhix"));
    }
}
