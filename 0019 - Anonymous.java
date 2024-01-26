package com.chandrika;

public class Anonymous
{
    public static void main(String[] args)
    {
        Sum(new int[]{10, 20, 30, 40});   // Anonymous array
       // Sum1(new int[][]{{10, 20, 30, 40}, {10, 20, 30, 40}});   // Anonymous array
    }
    public static void Sum(int[] x)
    {
        int total = 0;
        for (int x1 : x)
        {
            total = total + x1;
        }
        System.out.println("The sum : " +total);
    }

//    public static void Sum1(int[][] x1)
//    {
//        int total1 = 0;
//        for (int x2 : x1)
//        {
//            total1 = total1 + x2;
//        }
//        System.out.println("The sum : " +total1);
//    }
}
