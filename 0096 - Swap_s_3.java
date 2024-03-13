package com.chandrika;

public class Swap_s_3
{
    public static void main(String args[])
    {
        System.out.println("Before swapping");
        int x = 100;
        int y = 250;
        System.out.println("value of x : " + x);
        System.out.println("value of y : " + y);

        System.out.println("\nAfter swapping");
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("value of x : " + x);
        System.out.println("value of y : " + y);
    }
}
