package com.chandrika;
import java.util.Arrays;

public class Multidimensional_Array_Print
{
    public static void main(String[] args) {
        int[][] print = {{1, 2}, {3, 4}, {5, 6, 7}};

        System.out.println(Arrays.deepToString(print));         // here Arrays is from package
        System.out.println(print);
    }
}
