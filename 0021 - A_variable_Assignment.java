package com.chandrika;

public class A_variable_Assignment
{
    public static void main(String[] args)
    {
        // CASE - 1
        int[] x = {10, 20, 30, 40};
        char[] ch = {'a', 'b', 'c', 'd'};

        int[] b = x;
        //  int[] c = ch;      // CE

        String[] s =  {"A", "B", "C"};
        Object[] a = s;
        System.out.println(s);


        // CASE - 2
        int[] c = {10, 20, 30, 40, 50, 60};
        int[] d = {70, 80};

        c = d;
        d = c;
        System.out.println(c[1]);
        System.out.println(d[0]);

        int[][] x1 = new int[3][];
       // x[0] = new int[4][3];
       // x1[0] = 10;
        x1[0] = new int[2];
        System.out.println(x1[0]);

        String[] argh = {"x", "y", "z"};
        args = argh;
        for (String s1 : args)
        {
            System.out.println(s1);
        }
        
        
    }
}

