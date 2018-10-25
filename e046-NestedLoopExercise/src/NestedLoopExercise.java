import java.util.Scanner;

/*
    Author: Daniel Romero
    Exercise: prime numbers
*/


// Class NestedLoopExercise
public class NestedLoopExercise
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

        if (a<0) a=0;

        for (int i=2; i<=a; i++)
        {
            int counter = 0;
            for (int j=1; j<=i; j++)
            {
                if (i%j==0) counter++;
            }
            if (counter==2) System.out.println(i);
        }
    }

    // Main method
    public static void main (String args[])
    {
        new NestedLoopExercise().init();
    }
}