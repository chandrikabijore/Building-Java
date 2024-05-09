package com.chandrika;

import java.util.Scanner;

public class Multiplication_Table_s
{
    public static void main(String[] args)
    {
        int n;
        Scanner table = new Scanner(System.in);
        System.out.println("Enter any no to print the table : ");
        n = table.nextInt();

        for (int i = 1; i <= 10; i++)
        {
            System.out.printf("%d * %d = %d\n", n, i, n * i);
        }
    }
}
