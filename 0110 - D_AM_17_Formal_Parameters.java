package com.chandrika;

public class D_AM_17_Formal_Parameters
{
    public static void main(String[] args)
    {
        m1('s', 20);     // calling m1 with actual parameters
    }
    public static void m1(final char x, int y)
    {
//        x = 100;                                  // Formal parameter simply access LV of that method
//        y = 200;                                  // But if Formal Parameter is declared as final then we can't perform reassignments
        System.out.println(x+".........."+y);
    }
}

 
