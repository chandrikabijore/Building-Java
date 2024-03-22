package com.chandrika;

public class D_AM_15_sctrictfp_M
{
    public static void main(String[] args)
    {
        System.out.println("Trying Strictfp Modifier to get accurate result.. \n");

        A1 a = new A1();

        a.m1();
    }

}
class A1
{
    strictfp public void m1()
    {
        System.out.println(10.0/3);
    }
}

