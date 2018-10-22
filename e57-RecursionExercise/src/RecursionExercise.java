import java.util.Scanner;

/*
    Author: Daniel Romero
    Exercise: Fibonacci succession
*/


// Class RecursionExercise
public class RecursionExercise
{
    // Constants
    final Scanner in = new Scanner(System.in);

    // Methods
    int console()
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

        return a;
    }

    int fibonacci(int n)
    {
        int f = 1;
        if (n < 2) return 1;
        f = fibonacci(n-1) + fibonacci(n-2);
        return f;
    }

    void init()
    {
        int number = console();
        int f = fibonacci(number);
        System.out.println(f);

        //System.out.println(fibonacci(console()));
    }

    // Main method
    public static void main (String args[])
    {
        new RecursionExercise().init();
    }
}