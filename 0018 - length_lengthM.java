package com.chandrika;

public class length_lengthM
{
    public static void main(String[] args)
    {
        // length var is applicable or arrays
        int[] x = new int[6];
        System.out.println("The size of x variable is : " + x.length);
        //System.out.println("The size of x is : " + x.length());


        // length Method is applicable or String
        String x1 = "Shivi";      // 5
        //System.out.println("The size of x1 is : " + x1.length);
        System.out.println("\nThe size of x1 method is : " + x1.length());


        String[] s = {"A", "AA", "AAA"};
        System.out.println("\nThe size of String is : " + s.length);                    // 3
        // System.out.println(s.length());               // CE
        // System.out.println(s[0].length);              // CE
        // System.out.println(s[0].length());            // 1

        // in multi dimentional arrays length var always represents base size not total size
        // EXAMPLE 1
        int[][] a = new int[6][3];
        System.out.println(a.length);
        System.out.println(a[0].length);
        System.out.println(a[1].length);
        System.out.println(a[2].length);
        System.out.println(a[3].length);
        System.out.println(a[4].length);
        System.out.println(a[5].length);
        // System.out.println(a[6].length);


        // EXAMPLE 2
        // Three dimentional array
        int[][][] x4 = {{{10, 20,30}, {40, 50, 60}}, {{70, 80}, {90, 100, 110}}};
        System.out.println(x4);
        System.out.println(x4[0][1][2]);    // 60
        System.out.println(x4[1][0][1]);    // 80
        System.out.println(x4[1][1][1]);    // 100
//      System.out.println(x4[2][1][0]);    // AIOOBE
//      System.out.println(x4[2][0][0]);    // AIOOBE
//      System.out.println(x4[1][2][0]);    // AIOOBE

        System.out.println(x4.length);
    }
}
