package com.chandrika;

public class Operator_Equality
{
    public static void main(String[] args) {
        System.out.println(10 == 20);
        System.out.println('a' == 'b');
        System.out.println('a' == 97.0);
        System.out.println(false == false);


        Thread t1 = new Thread();
        Thread t2 = new Thread();
        Thread t3 = t1;
        System.out.println(t1 == t2);
        System.out.println(t1 == t3);


        //Thread t = new Thread();
        //Thread O = new Object();
        //String S = new String("Shivi");
       //System.out.println(t == O);
       //System.out.println(O == S);
       //System.out.println(S == t);

        String s1 = new String("Shivi");
        String s2 = new String("Shivi");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

//        String s2 = null String("chandrika");
//        System.out.println(s2 == null);

        String  s = null;
        System.out.println(s == null);

        System.out.println(null == null);
    }
}
