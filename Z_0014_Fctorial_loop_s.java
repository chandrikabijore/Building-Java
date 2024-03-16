package com.chandrika;

import java.util.Scanner;

public class Fctorial_loop_s
{
    public static void main(String[] args)
    {
        int number, Factorial = 1;
        Scanner fact = new Scanner(System.in);
        System.out.println("Enter the number : ");
        number = fact.nextInt();

        for (int i = 1; i <= number; i++)
        {
            Factorial = Factorial * i;
        }
        System.out.printf("Factorial of %d is : %d\n", number,Factorial);
    }
}
