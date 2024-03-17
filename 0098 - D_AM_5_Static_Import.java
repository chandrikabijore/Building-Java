package com.chandrika;

import static java.lang.Math.*;

public class D_AM_5_Static_Import
{
    public static void main(String[] args)
    {
        // without static import
        System.out.println(sqrt(4));
        System.out.println(Math.max(23,87));
        System.out.println(Math.random());

        // with static import
        System.out.println(sqrt(6));
        System.out.println(max(78,87));
        System.out.println(random());
        System.out.println(min(56,488));
    }
}
