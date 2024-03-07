package com.chandrika;

import java.util.Scanner;

public class Flow_Control_switch_1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value for a : ");
        int a = sc.nextInt();

        System.out.println("Enter the value of b : ");
        int b = sc.nextInt();

        System.out.println("Enter the value of c : ");
        int c = sc.nextInt();

        int sum = a + b + c;
        System.out.println("The sum of " + a+" "+ b+" "+ c+" "+ "is : " + sum);
    }
}

