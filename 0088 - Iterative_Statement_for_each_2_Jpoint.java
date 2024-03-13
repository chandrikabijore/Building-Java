// Let us see another of Java for-each loop where we are going to total the elements.
package com.chandrika;

public class Iterative_Statement_for_each_2_Jpoint
{
    public static void main(String[] args)
    {
        int arr[] = {10, 20, 40, 82};
        int total = 0;
        for (int i : arr)
        {
            total = total + i;
        }
        System.out.printf("The total of this numbers is : %d", total);
    }
}
