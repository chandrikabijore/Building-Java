package com.chandrika;

public class Variable_Instance
{
    int a = 10;

    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    boolean bo;
    String S;

    public static void main(String[] args)
    {
       // System.out.println(a);
        Variable_Instance var = new Variable_Instance();
        System.out.println("Static area : " + var.a);

        System.out.println("Deault value of byte : " + var.b);
        System.out.println("Deault value of short : " + var.s);
        System.out.println("Deault value of int : " + var.i);
        System.out.println("Deault value of long : " + var.l);

        System.out.println("Deault value of float : " + var.f);
        System.out.println("Deault value of double : " + var.d);
        System.out.println("Deault value of boolean : " + var.bo);
        System.out.println("Deault value of String : " + var.S);
    }
    public void m1()
    {
        System.out.println("Instance method : " + a);
    }
}
