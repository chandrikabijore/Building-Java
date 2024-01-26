package com.chandrika;

public class A_element_Assignment
{
    public static void main(String[] args)
    {
        // for primitive type arrays - element assignment
        int[] x = new int[5];
        x[0] = 10;
        x[1] = 'a';
        byte b = 20;
        x[2] = b;
        short s = 30;
        x[3] = s;
        //  x[4] = 100l;

        System.out.println(x.length);
        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
        System.out.println(x[3]);
        //  System.out.println(x[4]);


        // for object type arrays - element assignment
        // EXAMPLE - 1
        Object[] a = new Object[10];
        a[0] = new Object();
        a[1] = new java.lang.String("Shivi");
        a[2] = new Integer(10);
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);

        // EXAMPLE - 2
//        Number[] n = new Number[10];
//        n[0] = new  Integer(10);
//        n[1] = new  double(10.5);
//        n[2] = new java.lang.String("chandrika");


        // for interace type arrays - element assignment
        Runnable[] r = new Runnable[10];
        r[0] = new Thread();
       // r[1] = new String("shivi");
        System.out.println(r);
    }
}
