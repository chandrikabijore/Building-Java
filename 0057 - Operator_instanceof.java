package com.chandrika;

public class Operator_instanceof
{
    public static void main(String[] args)
    {
        Thread t = new Thread();
        // EXAMPLE - 1
        System.out.println(t instanceof Thread);
        System.out.println(t instanceof Object);
        System.out.println(t instanceof Runnable);

        // EXAMPLE - 2
        //System.out.println(t instanceof String);

        // EXAMPLE - 3
        System.out.println(null instanceof Thread);
        System.out.println(null instanceof Object);
        System.out.println(null instanceof Runnable);
    }
}
