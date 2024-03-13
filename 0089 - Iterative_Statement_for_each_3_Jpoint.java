package com.chandrika;

public class Iterative_Statement_for_each_3_Jpoint
{
    public static void main(String[] args)
    {
        int[] x = {10, 20, 30, 40, 50};
        for (int x1 : x)
        {
            System.out.println(x1);
        }

        int[][] a = {{5, 15, 25}, {35, 45}};
        for (int[] a1 : a)
        {
            for (int a2 : a1)
            {
                System.out.println(a1);
            }
        }

        int[][][] p = {{{28, 37}, {78, 97,67}, {82, 34, 76}}};
        for (int[][] p1 : p)
        {
            for (int[] p2 : p1)
            {
                for (int p3 : p2)
                {
                    System.out.println(p3);
                }
            }
        }
    }
}
