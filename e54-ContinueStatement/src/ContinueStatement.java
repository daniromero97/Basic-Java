/*
    Author: Daniel Romero
    Exercise: counter of positive and negative numbers
*/


// Class ContinueStatement
public class ContinueStatement
{
    // Methods
    void init()
    {
        for(int i=0; i<=5; i++ )
        {
            if(i == 3) continue;
            System.out.println(i);
        }
    }

    // Main method
    public static void main (String args[])
    {
        new ContinueStatement().init();
    }
}