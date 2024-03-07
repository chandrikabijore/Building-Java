package com.chandrika;

import java.util.Scanner;

public class Flow_Control_switch
{
    public static void main(String[] args)
    {

        System.out.println("Enter the value of x : ");
        Scanner val = new Scanner(System.in);
        int x = val.nextInt();
        
        switch (x)
        {
            case 0:
                System.out.println(0);
            case 10:
                System.out.println(5);
                break;
            case 2:
                System.out.println(10);
        }
    }
}

