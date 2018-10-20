/*
    Author: Daniel Romero
    Exercise: for loop
*/


// Class ForLoop
public class ForLoop
{
    // Methods
    void init()
    {
        for (int i=0; i<10; i++)
            System.out.println("loop: " + i + ", even: " + (i%2==0));
    }

    // Main method
    public static void main (String args[])
    {
        new ForLoop().init();
    }
}