package com.chandrika;

import java.util.Scanner;

public class AreaofCircle_s
{
    public static void main(String[] args)
    {
        double Area, radius;
        Scanner circle = new Scanner(System.in);

        System.out.println("Enter the radius of the circle : ");
        radius = circle.nextDouble();

        Area = Math.PI * radius * radius;

        System.out.printf("The area of circle is : %f", Area);
    }
}
