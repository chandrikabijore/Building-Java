package com.chandrika;

import java.util.Scanner;

public class EvenOdd_s
{
    public static void main(String[] args)
    {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter here any no : ");
        n = scan.nextInt();

        // r = n%2;
         if (n % 2 == 0)
         {
             System.out.println(n+ " is Even");
         }
         else
         {
             System.out.println(n+ " is Odd");
         }
    }
}
