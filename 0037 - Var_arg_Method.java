package com.chandrika;

public class Var_arg_Method
{
    public static void m1(int... x)
    {
        System.out.println("Var-arg-method" + x.length);
    }
    public static void main(String[] args)
    {
        m1();
        m1(10);
        m1(10, 20);
        m1(10, 20, 30);
        m1(10, 20, 30, 40);
        m1(10, 20, 30, 40, 10, 20, 30, 40, 10, 20, 30, 40);
    }
}
