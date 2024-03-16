package com.chandrika;        // 1503_1
import java.math.BigInteger;
import java.util.Scanner;

public class Factorial_Biginteger_s
{
    public static void main(String[] args)
    {
        int number;
        Scanner n = new Scanner(System.in);
        System.out.println("Enter any number : ");
        number = n.nextInt();

        BigInteger Factorial = BigInteger.ONE;
        if (number < 0)
            System.out.println("Can't find factorial of negative number!!");
        else if (number <= 1)
            System.out.printf("%d! = %d", number, Factorial);
        else
        {
            for (int i = number; i >= 2; i--)
            {
                Factorial = Factorial.multiply(BigInteger.valueOf(i));
            }
            System.out.printf("%d! = %d", number, Factorial);
        }
    }
}

