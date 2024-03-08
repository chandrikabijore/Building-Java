package com.chandrika;

//import sun.tools.jstat.Scale;

import java.util.Scanner;

public class Flow_Control_fall_through_inside_switch_1
{
    public static void main(String[] args)
    {     // 3 ex
        System.out.println("Enter the value of x : ");
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();

        switch (x)
        {
            default:
                System.out.println("def");
                break;
            case 0:
                System.out.println(0);
            case 1:
                System.out.println(1);
            case 2:
                System.out.println(2);
        }

        // 2 ex
//        System.out.println("Enter the value of x : ");
//        Scanner s = new Scanner(System.in);
//        int x = s.nextInt();
//
//        switch (x)
//        {
//            case 0:
//                System.out.println(0);
//            case 1:
//                System.out.println(1);
//            case 2:
//                System.out.println(2);
//                break;
//            case 3:
//                System.out.println(3);
//            default:
//                System.out.println("def");
//        }


        // 1 ex
//        int x = 2;
//        switch (x)
//        {
//            case 1:
//            case 2:
//            case 3:
//                System.out.println("Shivi");
//                break;
//            case 4:
//            case 5:
//            case 6:
//                System.out.println("Bijore");
//                break;
//        }
    }
}
