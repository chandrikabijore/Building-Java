package com.chandrika;

// Abstract class
abstract class Animal
{
    // Abstract method
    public abstract void makeSound();
}

// Dog class inheriting Animal
class Dogi extends Animal
{
    // Implementation of abstract method
    public void makeSound()
    {
        System.out.println("Woof");
    }
}

// Cat class inheriting Animal
class Cat extends Animal
{
    // Implementation of abstract method
    public void makeSound()
    {
        System.out.println("Meow");
    }
}

// Main class
public class D_AM_13_abstract_M
{
    public static void main(String[] args)
    {
        // Creating objects of Dog and Cat
        Dogi dog = new Dogi();
        Cat cat = new Cat();

        // Calling makeSound() method
        dog.makeSound(); // Output: Woof
        cat.makeSound(); // Output: Meow
    }
}
