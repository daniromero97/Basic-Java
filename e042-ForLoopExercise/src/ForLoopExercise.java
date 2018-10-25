import java.util.Scanner;

/*
    Author: Daniel Romero
    Exercise: multiplication table
*/


// Class ForLoopExercise
public class ForLoopExercise
{
    // Constants
    final Scanner in = new Scanner(System.in);

    // Methods
    void init()
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

        for (int i=0; i<=10; i++)
            System.out.println(a + "x" + i + " = " + (a*i));
    }

    // Main method
    public static void main (String args[])
    {
        new ForLoopExercise().init();
    }
}