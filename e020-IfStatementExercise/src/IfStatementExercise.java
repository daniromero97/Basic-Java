import java.util.Scanner;

/*
    Author: Daniel Romero
    Exercise: the biggest
*/


// Class IfStatementExercise
public class IfStatementExercise
{
    // Constants
    final Scanner in = new Scanner(System.in);

    // Methods
    void init()
    {
        double a, b;
        String s = "They are equal";

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


        if (a>b) s = "The first is greater than the second";
        if (a<b) s = "The first is less than the second";

        System.out.println(s);
    }

    // Main method
    public static void main (String args[])
    {
        new IfStatementExercise().init();
    }
}