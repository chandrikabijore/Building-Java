package com.chandrika;
import java.util.Scanner;
public class Add_s
{
    public static void main(String[] args)
    {
        int number1, number2, Addition;
        
        System.out.println("Enter the number one here : ");
        Scanner input = new Scanner(System.in);
        number1 = input.nextInt();
        

        System.out.println("Enter the second number here : ");
        number2 = input.nextInt();
        input.close();

        Addition = number1 + number2;
        System.out.printf("%d + %d = %d", number1, number2, Addition);
    }
}
