import java.util.Scanner;

/*
    Author: Daniel Romero
    Exercise: the sum
*/


// Class IfStatementExercise
public class IfStatementExercise
{
    // Constants
    final Scanner in = new Scanner(System.in);

    // Methods
    void init()
    {
        int a, b, c;
        String s = "None is the sum of the other two";

        System.out.print("Write the first value: ");
        while(!in.hasNextInt())
        {
            in.nextLine();
            System.out.println("Wrong value");
            System.out.print("Write the first value: ");
        }
        a = in.nextInt();
        in.nextLine();

        System.out.print("Write the second value: ");
        while(!in.hasNextInt())
        {
            in.nextLine();
            System.out.println("Wrong value");
            System.out.print("Write the second value: ");
        }
        b = in.nextInt();
        in.nextLine();

        System.out.print("Write the third value: ");
        while(!in.hasNextInt())
        {
            in.nextLine();
            System.out.println("Wrong value");
            System.out.print("Write the third value: ");
        }
        c = in.nextInt();
        in.nextLine();

        if (a == b+c) s = a + "=" + b + "+" + c;
        if (b == a+c) s = b + "=" + a + "+" + c;
        if (c == b+a) s = c + "=" + b + "+" + a;

        System.out.println(s);
    }

    // Main method
    public static void main (String args[])
    {
        new IfStatementExercise().init();
    }
}