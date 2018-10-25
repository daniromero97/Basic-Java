import java.util.Scanner;

/*
    Author: Daniel Romero
    Exercise: leap year
*/


// Class IfStatementExercise
public class IfStatementExercise
{
    // Constants
    final Scanner in = new Scanner(System.in);

    // Methods
    void init()
    {
        int year;
        String s = "Is not leap year";

        System.out.print("Write a year: ");
        while(!in.hasNextInt())
        {
            in.nextLine();
            System.out.println("Wrong value");
            System.out.print("Write a year: ");
        }
        year = in.nextInt();
        in.nextLine();

        if ((year%4==0 && year%100!=0) || (year%4==0 && year%100==0 && year%400==0)) s = "Is leap year";

        System.out.println(s);
    }

    // Main method
    public static void main (String args[])
    {
        new IfStatementExercise().init();
    }
}