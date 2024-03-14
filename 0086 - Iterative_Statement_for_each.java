package com.chandrika;

public class Iterative_Statement_for_each
{
    public static void main(String[] args)
    {
        int[] x = {10, 20, 30, 40, 50};

        // Noemal loop

//        System.out.println(x.length);
//        for (int i = 0; i < x.length; i++)
//        {
//            System.out.println("The length of x is : " + x[i]);
//        }

        // for-each loop

        for (int x1 : x)
        {
            System.out.println(x1);
        }
    }
}

