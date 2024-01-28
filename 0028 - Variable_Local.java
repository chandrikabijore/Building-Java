package com.chandrika;

public class Variable_Local
{
    public static void main(String[] args)
    {
        int i = 0;
        for (int j = 0; j < 3; j++)
        {
            i = i + j;
            System.out.println(i);
            System.out.println(j);
        }
        System.out.println(i);
        // System.out.println(i + "..........." + j);       // j is LV
    }
}
