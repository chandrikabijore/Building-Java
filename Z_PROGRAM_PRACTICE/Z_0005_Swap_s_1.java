package com.chandrika;

import java.util.Scanner;

public class Swap_s_1
{
    public static void main(String[] args)
    {
        int a, b, temp;
        Scanner swap = new Scanner(System.in);

        System.out.println("Enter number for a: ");
        a = swap.nextInt();

        System.out.println("Enter number for b : ");
        b = swap.nextInt();

        System.out.printf("Before swapping a = %d and b = %d", + a, b);

        temp = a;
        a = b;
        b = temp;

        System.out.printf("\n\nAfter swapping a = %d and b = %d", + a,  b);
    }
}
