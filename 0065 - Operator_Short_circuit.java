package com.chandrika;

public class Operator_Short_circuit
{
    public static void main(String[] args)
    {
        int x = 10, y = 15;

        //In operator ko bi use kr ke dekh skte h instead of given (&, &&, |, ||)
        if (++x < 10 || ++y > 15)
        {
            x++;
        }
        else
        {
            y++;
        }
        System.out.println(x+" "+y);
    }
}
