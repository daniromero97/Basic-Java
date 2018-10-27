import java.util.Scanner;

/*
    Author: Daniel Romero
    Exercise: Make a program that reads two numbers, generate two random numbers between their absolute values and shows which is higher.
*/


// Class MathClass
public class MathClass
{
    // Constants
    final Scanner in = new Scanner(System.in);

    // Methods
    void reading()
    {
        int a, b;
        double random1, random2;

        System.out.print("Write the first number (less): ");
        while(!in.hasNextInt())
        {
            in.nextLine();
            System.out.println("Wrong value");
            System.out.print("Write the first number (less): ");
        }
        a = in.nextInt();
        a = Math.abs(a);
        in.nextLine();

        System.out.print("Write the second number (higher): ");
        while(!in.hasNextInt())
        {
            in.nextLine();
            System.out.println("Wrong value");
            System.out.print("Write the second number (higher): ");
        }
        b = in.nextInt();
        b = Math.abs(b);
        in.nextLine();

        System.out.println("a: " + a);
        System.out.println("b: " + b);


        random1 = (Math.random() * (b-a)) + a;
        System.out.println("random1: " + random1);

        random2 = (Math.random() *(b-a)) + a;
        System.out.println("random2: " + random2);

        System.out.println("random1 top: " + (random1>random2));
        System.out.println("random2 top: " + (random2>random1));
    }

    // Main method
    public static void main (String args[])
    {
        new MathClass().reading();
    }
}