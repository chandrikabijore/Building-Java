package com.chandrika;

public class Operator_Increment_decrement
{
    public static void main(String[] args)
    {
        // CASE - 1

       int x = 10;
       int y = ++x;
       System.out.println(y);

//        int x = 10;
//        int y = ++10;
//        System.out.println(y);      // CE


        // CASE - 2

//        int x1 = 10;
//        int y1 = ++ (++x);

        // CASE - 3

//        final int x2 = 30;
//        x2++;
//        System.out.println(x2);

        // CASE - 4

        int x3 = 20;
        x3++;
        System.out.println(x3);

        char ch = 'a';
        ch++;
        System.out.println(ch);

        double d = 10.5;
        d++;
        System.out.println(d);

//        boolean b = true;
//        b++;
//        System.out.println(b);

    }
}
