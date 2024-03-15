package com.chandrika;

import java.util.Scanner;

public class Largest_s_1
{
    public static void main(String[] args)
    {
        int a,b,c,largest;
        Scanner abc = new Scanner(System.in);

        System.out.println("Enter value for a :");
        a = abc.nextShort();

        System.out.println("enter value for b : ");
        b = abc.nextInt();

        System.out.println("Enter value for c : ");
        c = abc.nextInt();

        if (a > b && a > c)
            largest = a;
        else if (b > a && b > c)
            largest = b;
        else
            largest = c;

        System.out.printf("The largest number among a = %d, b = %d, c = %d is : " + a,b,c,largest);
    }
}
