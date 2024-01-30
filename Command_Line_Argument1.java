package com.chandrika;

public class Command_Line_Argument1
{

    // CASE - 1

//    public static void main(String[] args)
//    {
//         for (int i = 0; i < args.length; i++)
//         {
//             System.out.println(args[i]);
//         }
//    }

    // CASE - 2

    public static void main(String[] args)
    {
        String[] argh = {"x", "y", "z"};
        args = argh;
        for (String s : args)
        {
            System.out.println(s);
        }
    }

    // CASE - 3

//    public static void main(String[] args)
//    {
//        System.out.println(args[0] + args[1]);
//    }

    // CASE - 4

//    public static void main(String[] args)
//    {
//        System.out.println(args[0]);
//    }
}



