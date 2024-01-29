package com.chandrika;

public class Var_arg_Method3
{
    public static void m1(int... x)
    {
        System.out.println("Var_arg_Method");
    }
    static void m1(int x)
    {
        System.out.println("General Method");
    }

    public static void main(String[] args)
    {
        m1();
        m1(10, 20);
        m1(10);
    }
}
