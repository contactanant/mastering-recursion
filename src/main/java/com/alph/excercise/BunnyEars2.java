package com.alph.excercise;

/**
 We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears.
 The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot.
 Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

 bunnyEars2(0) → 0
 bunnyEars2(1) → 2
 bunnyEars2(2) → 5
 bunnyEars2(3) → 7
 */
public class BunnyEars2 {

    public int calculate(int bunnies) {
        if (bunnies < 0) return 0;
        return bunnies <=1 ? 2 * bunnies : (bunnies % 2 == 0 ? 3  : 2 ) + calculate(bunnies-1);
    }

    public static void main(String[] args) {
        System.out.println(new BunnyEars2().calculate(0));
        System.out.println(new BunnyEars2().calculate(1));
        System.out.println(new BunnyEars2().calculate(2));
        System.out.println(new BunnyEars2().calculate(3));
        System.out.println(new BunnyEars2().calculate(4));
    }
}
