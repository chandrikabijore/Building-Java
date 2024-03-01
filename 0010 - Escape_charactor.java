package com.chandrika;

public class Escape_charactor
{
    public static void main(String[] args)
    {
        // \t insert the tab space
        String str = "Chandrika\tBijore";
        System.out.println(str);

        // it insert a new line
        String str1 = "Student at International Institute of Professional Studies, Davv \n| Programming Enthusiast | Web Developer | CS Grad'25";
        System.out.println(str1);

        // it insert a backslash
        String str2 = "And\\or";
        System.out.println(str2);

        // it insert a carriage
        String str3 = "Carriagereturn\rhvhvh";
        System.out.println(str3);
    }
}

