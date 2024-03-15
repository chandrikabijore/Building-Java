package com.chandrika;

import java.util.Scanner;

public class LargestN_Ternary_s
{
    public static void main(String[] args)
    {
        int no1, no2, no3, Largest;

        Scanner larg = new Scanner(System.in);
        System.out.println("Enter value for no1 : ");
        no1 = larg.nextInt();

        System.out.println("Enter value for no2 : ");
        no2 = larg.nextShort();

        System.out.println("Enter value for no3 : ");
        no3 = larg.nextInt();

        Largest = (no1 > no2 && no1 > no3) ? no1 : ((no2 > no3 && no2 > no3) ? no2 : no3);
        System.out.printf("Largest value among %d, %d and %d is : %d",  no1, no2, no3, Largest);

        int x = (10 < 20) ? 30 : 40;
        System.out.printf("\n x is : ", + x);
    }
}


