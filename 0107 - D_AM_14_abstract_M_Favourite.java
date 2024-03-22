package com.chandrika;

abstract public class D_AM_14_abstract_M_Favourite
{
    public static void main(String[] args)
    {
        Family F = new Family();
        Papa P = new Papa();

        F.Travel();
        P.Travel();
    }
}
abstract class Dream
{
    abstract public int Travel();
   // abstract public int Travel1();
}
class Family extends Dream
{
    public int Travel()
    {
        System.out.println("We Will go Kedarnath..!!");
        return 1;
    }
}
class Papa extends Dream
{
    public int Travel()
    {
        System.out.println("\nI will gift to Papa a Beautiful Bullet :) ");
        return 2;
    }
}
