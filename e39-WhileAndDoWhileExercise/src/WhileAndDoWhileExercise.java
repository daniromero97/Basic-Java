import java.util.Scanner;

/*
    Author: Daniel Romero
    Exercise: Generate random and save the biggest random
*/


// Class WhileAndDoWhileExercise
public class WhileAndDoWhileExercise
{
    // Constants
    final Scanner in = new Scanner(System.in);

    // Methods
    void init()
    {
        int random, biggest=0;

        do {
            random = (int) (Math.random() * (100));
            if (random>biggest) biggest=random;

            System.out.println(random);
        }while (random!=0);

        System.out.println("The biggest random: " + biggest);
    }

    // Main method
    public static void main (String args[])
    {
        new WhileAndDoWhileExercise().init();
    }
}