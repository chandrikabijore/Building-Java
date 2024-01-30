package com.chandrika;

public class Operator_Arithmetic
{
    public static void main(String[] args)
    {
        System.out.println('a' + 'b');

        System.out.println('a' + 0.89);

        //System.out.println(10/0);
        System.out.println(10/0.0);
        System.out.println(-10/0.0);
        //System.out.println(0/0);
        System.out.println(0.0/0);
        System.out.println(-0.0/0);


        // Not a number - NaN

        System.out.println(10<Float.NaN);
        System.out.println(10<=Float.NaN);
        System.out.println(10>Float.NaN);
        System.out.println(10>=Float.NaN);
        System.out.println(10==Float.NaN);
        System.out.println(Float.NaN==Float.NaN);
        System.out.println(10!=Float.NaN);
        System.out.println(Float.NaN!=Float.NaN);
    }
}
