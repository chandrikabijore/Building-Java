package com.chandrika;

public class Operator_Assignment_2
{
    public static void main(String[] args)
    {
        // conditional operator
        int x = (10 < 20) ? 30 : 40;
        System.out.println(x);

        int y = (10 > 20) ? 30 : ((40 > 50) ? 60 : 70);
        System.out.println(y);

        // new operator
        Operator_Assignment_2 T = new Operator_Assignment_2();

        // [] operator
        int[] x1 = new int[10];
    }
}
