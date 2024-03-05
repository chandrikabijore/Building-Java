package com.chandrika;

public class Operator_Assignment_1
{
    public static void main(String[] args)
    {
        int x = 20;
        x += 10;
        System.out.println("The value of x is : " + x);

        int a, b, c, d;
        a = b = c = d = 20;
        a += b -= c *= d /= 2;
        System.out.println(a + " " + b + " " + c + " " + d);
    }
}
