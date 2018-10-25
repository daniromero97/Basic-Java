import java.util.Scanner;

/*
    Author: Daniel Romero
    Exercise: the multiple
*/


// Class IfStatementExercise
public class IfStatementExercise
{
    // Constants
    final Scanner in = new Scanner(System.in);

    // Methods
    void init()
    {
        int a;
        String s = "The number is multiple of 15";

        System.out.print("Write a value (int): ");
        while(!in.hasNextInt())
        {
            in.nextLine();
            System.out.println("Wrong value");
            System.out.print("Write a value (int): ");
        }
        a = in.nextInt();
        in.nextLine();

        if (a%15!=0) s = "The number is not multiple of 15";
        System.out.println(s);

        if (a>100 || a<0) System.out.println("The number is not between 0 and 100");
    }

    // Main method
    public static void main (String args[])
    {
        new IfStatementExercise().init();
    }
}