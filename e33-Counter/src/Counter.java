import java.util.Scanner;

/*
    Author: Daniel Romero
    Exercise: counter of positive and negative numbers
*/


// Class Counter
public class Counter
{
    // Constants
    final Scanner in = new Scanner(System.in);

    // Methods
    void init()
    {
        int a, b, c, d, counter = 0;

        System.out.print("Write a value: ");
        while(!in.hasNextInt())
        {
            in.nextLine();
            System.out.println("Wrong value");
            System.out.print("Write a value: ");
        }
        a = in.nextInt();
        in.nextLine();

        System.out.print("Write a value: ");
        while(!in.hasNextInt())
        {
            in.nextLine();
            System.out.println("Wrong value");
            System.out.print("Write a value: ");
        }
        b = in.nextInt();
        in.nextLine();

        System.out.print("Write a value: ");
        while(!in.hasNextInt())
        {
            in.nextLine();
            System.out.println("Wrong value");
            System.out.print("Write a value: ");
        }
        c = in.nextInt();
        in.nextLine();

        System.out.print("Write a value: ");
        while(!in.hasNextInt())
        {
            in.nextLine();
            System.out.println("Wrong value");
            System.out.print("Write a value: ");
        }
        d = in.nextInt();
        in.nextLine();


        if (a>0) counter++;
        if (b>0) counter++;
        if (c>0) counter++;
        if (d>0) counter++;

        System.out.println("Positive: " + counter + "\nNegative: " + (4-counter));
    }

    // Main method
    public static void main (String args[])
    {
        new Counter().init();
    }
}