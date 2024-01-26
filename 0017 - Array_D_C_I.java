package com.chandrika;

public class Array_D_C_I
{
    public static void main(String[] args)
    {
        // one dimentional array
        int[] x =  {30};
        System.out.println(x);

        int[] x1 =  {30, 40};
        System.out.println(x1);

        int[] x2 =  {30, 40, 50};
        System.out.println(x2);

        // Two dimentional array
        int[][] x3 =  {{10, 20}, {30, 40, 50}};
        System.out.println(x3);

        // Three dimentional array
        int[][][] x4 = {{{10, 20,30}, {40, 50, 60}}, {{70, 80}, {90, 100, 110}}};
        System.out.println(x4);
        System.out.println(x4[0][1][2]);    // 60
        System.out.println(x4[1][0][1]);    // 80
        System.out.println(x4[1][1][1]);    // 100
        System.out.println(x4[2][1][0]);    // AIOOBE
        System.out.println(x4[2][0][0]);    // AIOOBE
        System.out.println(x4[1][2][0]);    // AIOOBE
    }
}
