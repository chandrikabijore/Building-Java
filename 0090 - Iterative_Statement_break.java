package com.chandrika;

public class Iterative_Statement_break
{
    public static void main(String[] args)
    {
        // 1) Inside switch

        int x = 1;
        switch (x) {
            case 0:
                System.out.println(0);
            case 1:
                System.out.println(1);
                // break;
            case 2:
                System.out.println(2);
            case 3:
                System.out.println(3);
        }

        // 2) Inside loop

        for (int i = 0; i <= 10; i++)
        {
            if (i == 5)
            {
                break;
            }
            System.out.println(i);
        }

        // 3) Inside labled blocks

        int a = 10;
        l1:
        {
            System.out.println("Begin");
            if (a == 11)
                break l1;
            System.out.println("end");
        }
        System.out.println("Hello");

        int x1 = 100;
        if (x1 == 100)
           // break;                            // CE
        System.out.println("Hello");
    }
}
