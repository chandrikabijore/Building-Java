package com.chandrika;

public class Flow_Control_fall_through_inside_switch
{
    public static void main(String[] args)
    {
        int x = 2;
        switch (x)
        {
            case 1:
            case 2:
            case 3:
                System.out.println("Q-4");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Q-i");
                break;
        }
    }
}


