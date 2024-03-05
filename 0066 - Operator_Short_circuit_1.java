package com.chandrika;

public class Operator_Short_circuit_1
{
    public static void main(String[] args) {
        int x = 10;
        if (++x < 10 && x/0 > 10)      // if we replace && operator with &, |, || the we will get Arithmatic Exception
        {
            System.out.println("HEllo");
        }
        else
        {
            System.out.println("Hiii");
        }
    }
}
