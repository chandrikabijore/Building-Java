package com.chandrika;
import java.util.Arrays;

public class Array_using_standard_library
{
    public static void main(String[] args)
    {
        // toString() is the built-in method of java.lang which return itself a string.
        // So here no actual conversion is performed. Since toString() method simply
        // returns the current string without any changes, there is no need to call
        // the string explicitly, it is usually called implicitly.

        int[] array = {1, 3, 5, 7, 9, 11, 13, 15 , 17, 19, 21};
        System.out.println(Arrays.toString(array));
    }
}
