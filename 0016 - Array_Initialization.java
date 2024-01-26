package com.chandrika;

public class Array_Initialization
{
    public static void main(String[] args)
    {
        int[][] x = new int[2][3];
        System.out.println(x);
        System.out.println(x[0]);
        System.out.println(x[0][0]);

        int[][] x1 = new int[2][];
        System.out.println(x);
        System.out.println(x[0]);
        System.out.println(x[0][0]);

        int[] s = new int[5];
        s[0] = 10;
        s[1] = 20;
        s[2] = 30;
        s[3] = 40;
        s[4] = 50;
//        s[5] = 60;              // AIOOBE
//        s[6] = 70;
    }
}
