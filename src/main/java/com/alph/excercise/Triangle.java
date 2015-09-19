package com.alph.excercise;

/**

 We have Triangle made of blocks. The topmost row has 1 block, the next row down has 2 blocks, the next row has 3 blocks, and so on. Compute recursively (no loops or multiplication) the total number of blocks in such a Triangle with the given number of rows.

 Triangle(0) → 0
 Triangle(1) → 1
 Triangle(2) → 3
 Triangle(3) → 6
 */
public class Triangle {

    public int calculate(int rows) {
        return rows <=0 ? 0 : rows + calculate(rows - 1);
    }

    public static void main(String[] args) {
        System.out.println(new Triangle().calculate(0));
        System.out.println(new Triangle().calculate(1));
        System.out.println(new Triangle().calculate(2));
        System.out.println(new Triangle().calculate(100));
    }
}
