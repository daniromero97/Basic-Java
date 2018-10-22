import java.util.Scanner;

/*
    Author: Daniel Romero
    Exercise: methods
*/


// Class Methods
public class Methods
{
    // Constants
    final Scanner in = new Scanner(System.in);

    // Methods
    int console()
    {
        int a;

        System.out.print("Write a value: ");
        while(!in.hasNextInt())
        {
            in.nextLine();
            System.out.println("Wrong value");
            System.out.print("Write a value: ");
        }
        a = in.nextInt();
        in.nextLine();

        return a;
    }

    void sum(int a, int b)
    {
        System.out.println("a + b = " + (a+b));
    }

    void init()
    {
        int n1 = console(), n2 = console();
        sum(n1, n2);
    }


    // Main method
    public static void main (String args[])
    {
        new Methods().init();
    }
}