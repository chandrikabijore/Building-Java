package com.chandrika;

public class Operator_StringConcatenation
{
    public static void main(String[] args) {
        System.out.println(10 + 20);
        System.out.println("ab" + "cd");

        String a = "shivi";
        int b = 10, c = 20, d = 30;
        System.out.println(a + b + c + d);
        System.out.println(b + c + d + a);
        System.out.println(b + c + a + d);
        System.out.println(b + a + c + d);

        System.out.println("EXAMPLE - 2\n");

        //System.out.println(a = b + c + d);
        System.out.println(a = a + b + c);
        //System.out.println(b = a + c + d);
        System.out.println(b = b + c + d);
    }
}
