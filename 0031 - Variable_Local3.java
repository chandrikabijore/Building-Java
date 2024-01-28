 package com.chandrika;

public class Variable_Local3
{
    public static void main(String[] args)
    {
        int x;
        if (args.length > 0)
        {
            x = 10;
        }
       // System.out.println(x);
        else
        {
            x = 20;
        }
        System.out.println(x);
        int A = args.length;
        System.out.println("length of args : " + A); // when we don'n paas any argument at runtime then length o args will be 0
    }
}
