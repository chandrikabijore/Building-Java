package com.chandrika;

public class Iterative_Statement_break_continue
{
    public static void main(String[] args)
    {
        System.out.println("For break statement...");
        l1 :
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                if (i == j)
                    break;
                System.out.println(i+"..."+j);
            }
        }


        System.out.println("\nFor break l1 statement...");
        l1 :
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                if (i == j)
                    break l1;
                System.out.println(i+"..."+j);
            }
        }
        System.out.println("No output for break l1");


        System.out.println("\nFor continue statement...");
        l1 :
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                if (i == j)
                    continue;
                System.out.println(i+"..."+j);
            }
        }


        System.out.println("\nFor continue l1 statement...");
        l1 :
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                if (i == j)
                    continue l1;
                System.out.println(i+"..."+j);
            }
        }     
    }
}
