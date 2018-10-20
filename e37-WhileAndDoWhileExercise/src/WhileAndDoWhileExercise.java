import java.util.Scanner;

/*
    Author: Daniel Romero
    Exercise: calculation of least common multiple
*/


// Class WhileAndDoWhileExercise
public class WhileAndDoWhileExercise
{
    // Constants
    final Scanner in = new Scanner(System.in);

    // Methods
    void init()
    {
        int a, b, m;

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


        m = (a>b)? a : b;
        while (m%a!=0 || m%b!=0)
            m++;

        System.out.println("least common multiple: " + m);
    }

    // Main method
    public static void main (String args[])
    {
        new WhileAndDoWhileExercise().init();
    }
}