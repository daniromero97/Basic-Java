import java.util.Scanner;

/*
    Author: Daniel Romero
    Exercise: reading of variables and rotation
*/


// Class AssignmentInstructions
public class AssignmentInstructions
{
    // Constants
    final Scanner in = new Scanner(System.in);

    // Methods
    void reading()
    {
        int a, b, c, d, e, aux;

        System.out.print("Write the value of the variable a: ");
        while(!in.hasNextInt())
        {
            in.nextLine();
            System.out.println("Wrong value");
            System.out.print("Write the value of the variable a: ");
        }
        a = in.nextInt();
        in.nextLine();

        System.out.print("Write the value of the variable b: ");
        while(!in.hasNextInt())
        {
            in.nextLine();
            System.out.println("Wrong value");
            System.out.print("Write the value of the variable b: ");
        }
        b = in.nextInt();
        in.nextLine();

        System.out.print("Write the value of the variable c: ");
        while(!in.hasNextInt())
        {
            in.nextLine();
            System.out.println("Wrong value");
            System.out.print("Write the value of the variable c: ");
        }
        c = in.nextInt();
        in.nextLine();

        System.out.print("Write the value of the variable d: ");
        while(!in.hasNextInt())
        {
            in.nextLine();
            System.out.println("Wrong value");
            System.out.print("Write the value of the variable d: ");
        }
        d = in.nextInt();
        in.nextLine();

        System.out.print("Write the value of the variable e: ");
        while(!in.hasNextInt())
        {
            in.nextLine();
            System.out.println("Wrong value");
            System.out.print("Write the value of the variable e: ");
        }
        e = in.nextInt();
        in.nextLine();


        System.out.println("\n***** DATA *****");
        System.out.println("INT 1 -> " + a);
        System.out.println("INT 2 -> " + b);
        System.out.println("INT 3 -> " + c);
        System.out.println("INT 4 -> " + d);
        System.out.println("INT 5 -> " + e);

        aux = a;
        a = b;
        b = c;
        c = d;
        d = e;
        e = aux;

        System.out.println("\n***** DATA ROTATED *****");
        System.out.println("INT 1 -> " + a);
        System.out.println("INT 2 -> " + b);
        System.out.println("INT 3 -> " + c);
        System.out.println("INT 4 -> " + d);
        System.out.println("INT 5 -> " + e);
    }

    // Main method
    public static void main (String args[])
    {
        new AssignmentInstructions().reading();
    }
}
