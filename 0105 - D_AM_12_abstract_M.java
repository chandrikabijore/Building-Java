package com.chandrika;

public class D_AM_12_abstract_M
{
    public static void main(String[] args)
    {
        Bus W = new Bus();
        Auto A = new Auto();

        W.getNoofWheels();
        A.getNoofWheels();
    }
}
abstract class Vehicle
{
    abstract public int getNoofWheels();
}
class Bus extends Vehicle
{
    public int getNoofWheels()
    {
        System.out.println("Total 7 Wheels in Bus.");
        return 7;
    }
}
class Auto extends Vehicle
{
    public int getNoofWheels()
    {
        System.out.println("Total 4 Wheels in Auto.");
        return 4;
    }
}
package com.chandrika;

public class D_AM_12_abstract_M
{
    public static void main(String[] args)
    {
        Bus W = new Bus();
        Auto A = new Auto();

        W.getNoofWheels();
        A.getNoofWheels();
    }
}
abstract class Vehicle
{
    abstract public int getNoofWheels();
}
class Bus extends Vehicle
{
    public int getNoofWheels()
    {
        System.out.println("Total 7 Wheels in Bus.");
        return 7;
    }
}
class Auto extends Vehicle
{
    public int getNoofWheels()
    {
        System.out.println("Total 4 Wheels in Auto.");
        return 4;
    }
}
