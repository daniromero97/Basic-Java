import java.util.Scanner;

/*
    Author: Daniel Romero
    Exercise: first odd numbers
*/


// Class BreakStatement
public class BreakStatement
{
    // Constants
    final Scanner in = new Scanner(System.in);

    // Methods
    void init()
    {
        int a, n=1;

        System.out.print("Write a value: ");
        while(!in.hasNextInt())
        {
            in.nextLine();
            System.out.println("Wrong value");
            System.out.print("Write a value: ");
        }
        a = in.nextInt();
        in.nextLine();

        if (a<1) a=1;

        while (true)
        {
            if (n%2!=0) System.out.println("odd: " + n);
            n++;
            if (n==a) break;
        }

    }

    // Main method
    public static void main (String args[])
    {
        new BreakStatement().init();
    }
}