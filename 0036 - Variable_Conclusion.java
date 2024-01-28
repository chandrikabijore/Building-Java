package com.chandrika;

public class Variable_Conclusion
{
    // Instance Level

    int[] x;
    int[] x1 = new int[3];
    //static int[] s;
    static int[] s = {10, 20};
    static int[] s1 = new int[3];
    public static void main(String[] args)
    {
        Variable_Conclusion c = new Variable_Conclusion();
        System.out.println(c.x);
        //System.out.println(c.x[0]);

        Variable_Conclusion c1 = new Variable_Conclusion();
        System.out.println(c1.x1);
        // System.out.println(c1.x1[0]);


        // static Level

        System.out.println(s);
        System.out.println(s[0]);

        System.out.println(s1);
        System.out.println(s1[0]);


        // Local Level

        int[] L;

        //System.out.println(L);
        //System.out.println(L[0]);

        int[] L1 = new int[3];

        System.out.println(L1);
        System.out.println(L1[0]);
    }
}
