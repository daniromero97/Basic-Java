import java.util.Scanner;

/*
    Author: Daniel Romero
    Exercise: order the numbers
*/


// Class IfElseStatement
public class IfElseStatement
{
    // Constants
    final Scanner in = new Scanner(System.in);

    // Methods
    void init()
    {
        double a, b, c, aux;

        System.out.print("Write the first value: ");
        while(!in.hasNextDouble())
        {
            in.nextLine();
            System.out.println("Wrong value");
            System.out.print("Write the first value: ");
        }
        a = in.nextDouble();
        in.nextLine();

        System.out.print("Write the second value: ");
        while(!in.hasNextDouble())
        {
            in.nextLine();
            System.out.println("Wrong value");
            System.out.print("Write the second value: ");
        }
        b = in.nextDouble();
        in.nextLine();

        System.out.print("Write the third value: ");
        while(!in.hasNextDouble())
        {
            in.nextLine();
            System.out.println("Wrong value");
            System.out.print("Write the third value: ");
        }
        c = in.nextDouble();
        in.nextLine();


        aux = a;

        if (b>a)
        {
            a = b;
            b = aux;
        }
        else aux = b;

        if (c>b)
        {
            b = c;
            c = aux;
            aux = a;

            if (b>a)
            {
                a = b;
                b = aux;
            }
        }

        System.out.println(a + ", " + b + ", " + c);

    }

    // Main method
    public static void main (String args[])
    {
        new IfElseStatement().init();
    }
}