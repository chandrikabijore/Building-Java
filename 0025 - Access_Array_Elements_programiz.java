package com.chandrika;

public class Access_Array_Elements_programiz
{
    public static void main(String[] args)
    {
        int[] s = {10, 20, 30, 40, 50};

        System.out.println("Accessing the array elements : ");
        System.out.println("First Element : " + s[0]);
        System.out.println("Second Element: " + s[1]);
        System.out.println("Third Element : " + s[2]);
        System.out.println("Forth Element : " + s[3]);
        System.out.println("Fifth Element : " + s[4]);

        int[] age = {12, 5, 17};

        // using for loop
        System.out.println("Using for loop :");
        for (int i = 0; i < age.length; i++)
        {
            System.out.println(age[i]);
        }
    }
}
