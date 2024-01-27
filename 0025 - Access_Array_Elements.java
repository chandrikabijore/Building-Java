package com.chandrika;

public class Access_Array_Elements
{
    public static void main(String[] args)
    {
        // Creat an array
        int[] age = {7, 8, 4, 2, 10};

        // Accessing the element of array
        System.out.println("Accessing the each element of array : ");
        System.out.println("First Element : " + age[0]);
        System.out.println("Second Element : " + age[1]);
        System.out.println("Third Element : " + age[2]);
        System.out.println("Fourth Element : " + age[3]);
        System.out.println("Fifth Element : " + age[4]);

        // In the above example, notice that we are using the index number to access each element of the array.

        // We can use loops to access all the elements of the array at once.

        // Looping Through Array Elements

        int[] age1 = {7, 8, 10};

        System.out.println("Using for loop : ");
        for (int i = 0; i < age1.length; i++)
        {
            System.out.println(age1[i]);
        }
    }

}
