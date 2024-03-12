package com.chandrika;

import java.util.logging.SocketHandler;

public class Iterative_Statement_for_2
{
    public static void main(String[] args)
    {
        for (int i = 0; true; i++)
        {
            System.out.println("Hello");
            break;
        }
        // System.out.println("Hii");


//        for (int i = 0; false; i++)
//        {
//            System.out.println("Hello");
//        }
//        System.out.println("Hii");

//        for (int i = 0; ; i++)
//        {
//            System.out.println("Hello");
//        }
//        System.out.println("Hii");


        int a = 10, b = 20;
        for (int i = 0; a < b; i++)
        {
            System.out.println("Shivi");
            if (i == 6)
            {
                break;
            }
        }
        System.out.println("Chandrika");


        for (int i = 0; a > b; i++)
        {
            System.out.println("Shivi");
            if (i == 6)
            {
                break;
            }
        }
        System.out.println("Chandrika");

//        final int a1 = 10, b1 = 20;
//        for (int i = 0; a1 > b1; i++)
//        {
//            System.out.println("Shivi");
//            if (i == 6)
//            {
//                break;
//            }
//            System.out.println("Chandrika");
//        }

        final int a2 = 10, b2 = 20;
        for (int i = 0; a2 < b2; i++)
        {
            System.out.println("Shiv ji");
            if (i == 6)
            {
                break;
            }
            System.out.println("Mahashivratri");
        }
    }
}
