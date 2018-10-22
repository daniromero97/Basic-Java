import java.util.Scanner;

/*
    Author: Daniel Romero
    Exercise: recursion
*/


// Class Recursion
public class Recursion
{
    // Methods
    int factorial(int n)
    {
        if(n<=0) return 1;
        return n*factorial(n-1);
    }

    void init()
    {
       System.out.println(factorial(4));
    }

    // Main method
    public static void main (String args[])
    {
        new Recursion().init();
    }
}