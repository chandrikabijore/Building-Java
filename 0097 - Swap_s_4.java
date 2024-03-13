package com.chandrika;

import java.util.Scanner;

public class Swap_s_4
{
    public static void main(String[] args)
    {
        int x,y;
        Scanner s4 = new Scanner(System.in);
        System.out.println("Enter the value for x : ");
        x = s4.nextInt();

        System.out.printf("Enter the value for y : ");
        y = s4.nextInt();

        System.out.printf("Before swapping x = %d and y = %d", + x, y);

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.printf("\nAfter swapping x = %d and y = %d", + x, y);
    }
}
