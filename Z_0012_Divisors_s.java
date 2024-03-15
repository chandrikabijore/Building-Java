package com.chandrika;

import java.util.Scanner;

public class Divisors_s
{
    public static void main(String[] args)
    {
        int number;
        Scanner div = new Scanner(System.in);
        System.out.println("Enter the number : ");
        number = div.nextInt();

        System.out.printf("The divisors of number %d are : \n", number);
        for (int i = 1; i <= number; i++)
        {
            if ((number % i) == 0)
            {
                System.out.printf("%d\n", i);
            }
        }
    }
}
