import java.util.Scanner;

/*
    Author: Daniel Romero
    Exercise: Show all even numbers between two entered by console.
*/


// Class ForLoopExercise
public class ForLoopExercise
{
    // Constants
    final Scanner in = new Scanner(System.in);

    // Methods
    void init()
    {
        int a, b;

        System.out.print("Write a value: ");
        while(!in.hasNextInt())
        {
            in.nextLine();
            System.out.println("Wrong value");
            System.out.print("Write a value: ");
        }
        a = in.nextInt();
        in.nextLine();

        System.out.print("Write a value: ");
        while(!in.hasNextInt())
        {
            in.nextLine();
            System.out.println("Wrong value");
            System.out.print("Write a value: ");
        }
        b = in.nextInt();
        in.nextLine();


        for (int i=a; i<=b; i++)
            if (i%2==0) System.out.println(i);

    }

    // Main method
    public static void main (String args[])
    {
        new ForLoopExercise().init();
    }
}