import java.util.Scanner;

/*
    Author: Daniel Romero
    Exercise: console reading and evaluation of two numbers (first even, second odd, higher)
*/


// Class LogicalOperators
public class LogicalOperators
{
    // Constants
    final Scanner in = new Scanner(System.in);

    // Methods
    void init()
    {
        double a1, a2;

        System.out.print("Write a number: ");
        while(!in.hasNextDouble())
        {
            in.nextLine();
            System.out.println("Wrong value");
            System.out.print("Write a number: ");
        }
        a1 = in.nextDouble();
        in.nextLine();

        System.out.print("Write another number: ");
        while(!in.hasNextDouble())
        {
            in.nextLine();
            System.out.println("Wrong value");
            System.out.print("Write another number: ");
        }
        a2 = in.nextDouble();
        in.nextLine();


        System.out.println("The first is even and the second is odd? " + ((a1%2==0) && (a2%2!=0)));
        System.out.println("The first is greater than second? " + (a1>a2));
    }


    // Main method
    public static void main (String args[])
    {
        new LogicalOperators().init();
    }
}