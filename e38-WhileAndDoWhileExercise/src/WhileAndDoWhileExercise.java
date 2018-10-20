import java.util.Scanner;

/*
    Author: Daniel Romero
    Exercise: count the number of digits of a number
*/


// Class WhileAndDoWhileExercise
public class WhileAndDoWhileExercise
{
    // Constants
    final Scanner in = new Scanner(System.in);

    // Methods
    void init()
    {
        int a, counter = 0;

        System.out.print("Write a value: ");
        while(!in.hasNextInt())
        {
            in.nextLine();
            System.out.println("Wrong value");
            System.out.print("Write a value: ");
        }
        a = in.nextInt();
        in.nextLine();


        while (a>0)
        {
            a/=10;
            counter++;
        }

        System.out.println("Number of digits: " + counter);
    }

    // Main method
    public static void main (String args[])
    {
        new WhileAndDoWhileExercise().init();
    }
}