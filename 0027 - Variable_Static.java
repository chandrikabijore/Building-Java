package com.chandrika;

class Variable_Static
{
    static int c = 10;
    int y = 20;

    static int x;
    static double d;
    static String s;
    public static void main(String[] args)
    {
//        String name;
//        int roll;
//        Static clgN = 10;

        Variable_Static t = new Variable_Static();
        System.out.println("object ref : "  + t.x);                  // 10    // object ref
        System.out.println("Normal : " + x);                         // 10    //  Normal
        System.out.println("class name : "  + Variable_Static.x);    // 10    //  class name

        System.out.println("\nDefault value o int : " + x);
        System.out.println("Default value o double : " + d);
        System.out.println("Default value o String : " + s);

        System.out.println("\nx value : " + x);


        Variable_Static t1 = new Variable_Static();
        t1.x = 888;
        t1.y = 999;
        Variable_Static t2 = new Variable_Static();
        System.out.println(t2.x + "..." + t1.y);
    }

//    public void m1()
//    {
//        System.out.println(c);
//    }
}
