import java.util.Scanner;

/*
    Author: Daniel Romero
    Exercise: sum of positives
*/


// Class WhileAndDoWhileExercise
public class WhileAndDoWhileExercise
{
    // Constants
    final Scanner in = new Scanner(System.in);

    // Methods
    void init()
    {
        int a, sum = 0;

        do {
            System.out.print("Write a value: ");
            a = in.nextInt();
            in.nextLine();
            if (a>0) sum+=a;
        }while (a!=0);

        System.out.println("--- total ---\n" + sum);
    }

    // Main method
    public static void main (String args[])
    {
        new WhileAndDoWhileExercise().init();
    }
}