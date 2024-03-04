package com.chandrika;

public class Operator_TypeCast
{
    public static void main(String[] args)
    {
        int x = 'a';
        System.out.println(x);

        double d = 10;
        System.out.println(d);

        int x1 = 130;
        // byte b = x1;
        byte b = (byte)x1;
        System.out.println(b);

        int x2 = 150;
        short s = (short)x2;
        System.out.println(s);
        byte b1 = (byte)x2;
        System.out.println(b1);
    }
}
