package com.chandrika;

public class Array_Creation
{
    public static void main(String[] args)
    {
        int a[] = new int[3];

        int[] x = new int[3];
        System.out.println("\nOne dimentional array or int type :");
        System.out.println(a.getClass().getName());


        int a1[][] = new int[3][2];
       // int[][] x1 = new int[3][2];
        System.out.println("\nTwo dimentional array or int type :");
        System.out.println(a1.getClass().getName());


        double[] a2 = new double[4];
        //double[] a2 = new double[-4];
        System.out.println("\nOne dimentional array or double type :");
        System.out.println(a2.getClass().getName());


        short[] a3 = new short[1];
        System.out.println("\nOne dimentional array or short type :");
        System.out.println(a3.getClass().getName());

        byte[] a4 = new byte[0];
        System.out.println("\nOne dimentional array or byte type :");
        System.out.println(a4.getClass().getName());

        boolean[] a5 = new boolean[2];
        System.out.println("\nOne dimentional array or boolean type :");
        System.out.println(a5.getClass().getName());

        char[] a6 = new char['a'];
        System.out.println("\nOne dimentional array or char type :");
        System.out.println(a6.getClass().getName());

        byte b = 20;
        int[] a7 = new int[b];
        System.out.println("\nOne dimentional array or char type :");
        System.out.println(a7.getClass().getName());

    }

}
