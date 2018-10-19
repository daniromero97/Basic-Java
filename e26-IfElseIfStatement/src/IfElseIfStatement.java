import java.util.Scanner;

/*
    Author: Daniel Romero
    Exercise: increment
*/


// Class IfElseIfStatement
public class IfElseIfStatement
{
    // Constants
    final Scanner in = new Scanner(System.in);

    // Methods
    void init()
    {
        double a;

        System.out.print("Write a value: ");
        while(!in.hasNextDouble())
        {
            in.nextLine();
            System.out.println("Wrong value");
            System.out.print("Write a value: ");
        }
        a = in.nextDouble();



        if (a%2 == 0)
            a+=5;   // even
        else if(a%15==0)
            a+=10;  // multiple of 15
        else
            a++;    // odd and not multiple

        System.out.println(a);
        
    }

    // Main method
    public static void main (String args[])
    {
        new IfElseIfStatement().init();
    }
}