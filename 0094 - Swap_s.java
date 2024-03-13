package com.chandrika;

public class Swap_s
{
    public static void main(String[] args)
    {
        int a = 10,b = 20,c = 30;
        System.out.println("Befor swaping");
        System.out.println("a is "+a);
        System.out.println("b is "+b);

        c = a;
        a = b;
        b = c;

        System.out.println("after swaping");
        System.out.println("a is "+a);
        System.out.println("b is "+b);
    }
}
