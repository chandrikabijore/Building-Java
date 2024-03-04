package com.chandrika;
import java.util.Scanner;

public class Array_2
{
    public static void main(int[] args)
    {
        // creating object of Scanner class
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter length of Array: ");
        int arrLength = scan.nextInt();

        int[] anArray = new int[arrLength];
        System.out.println("Enter the elements of the Array");
        for (int i = 0; i < arrLength; i++)
        {
            // taking array input
            anArray[i] = scan.nextInt();
        }

        System.out.println("One dimensional array elements are:");
        for (int i = 0; i < arrLength; i++)
        {
            // printing array elements
            System.out.print(anArray[i] + " ");
        }
    }
}
