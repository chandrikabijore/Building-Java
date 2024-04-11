package com.chandrika;

import java.util.Scanner;

public class LargestN_s
{
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the value of a : ");
        a = sc.nextInt();

        System.out.println("Enter the value of b : ");
        b = sc.nextInt();

        System.out.println("Enter the value of c : ");
        c = sc.nextInt();

        if (a > b)
        {
            if (a > c)
            {
                System.out.println("\na is largest number!!");
            }
            else
            {
                System.out.println("\nC is largest number!!");
            }
        }
        else if (b > c)
        {
            System.out.println("\nB is largest number!!");
        }
    }
}
