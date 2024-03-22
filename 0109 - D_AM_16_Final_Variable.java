package com.chandrika;

public class D_AM_16_Final_Variable
{
    // Instance var
    //final int y;          // Without using we are getting errors in instance or statice
    int x;

    // Static var
   // final static int c;
    static int s;
    public static void main(String[] args) 
    {
        D_AM_16_Final_Variable f = new D_AM_16_Final_Variable();
        System.out.println(f.x);        // Normal instance var h esliye value default value print ki
        System.out.println(f.s);        // Normal static var h esliye value default value print ki
       //  System.out.println(f.y);

       // Static Var
       //  System.out.println(c);

        // Local var
        int a;                             // but in the case of LV perform initialization if u r useing that var if not then it is not recommonded to perform initialization for Final LV but for final instance or static it is required.
        System.out.println("Shiviiiiii");
    }
}
