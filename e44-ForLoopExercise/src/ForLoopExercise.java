import java.util.Scanner;

/*
    Author: Daniel Romero
    Exercise: throw die
*/


// Class ForLoopExercise
public class ForLoopExercise
{
    // Constants
    final Scanner in = new Scanner(System.in);

    // Methods
    void init()
    {
        // READING
        System.out.print("Write a value: ");
        while(!in.hasNextInt())
        {
            in.nextLine();
            System.out.println("Wrong value");
            System.out.print("Write a value: ");
        }
        int n = in.nextInt();
        in.nextLine();
        if (n < 1) n = 1;


        // CALCULATIONS
        int c1=0, c2=0, c3=0, c4=0, c5=0, c6=0;
        for (int i=0; i<=n; i++)
        {
            int throwDie = (int) (Math.random()*6 + 1);
            switch (throwDie)
            {
                case 1: c1++; break;
                case 2: c2++; break;
                case 3: c3++; break;
                case 4: c4++; break;
                case 5: c5++; break;
                case 6: c6++; break;
            }
        }


        // PRINT
        System.out.println("------------------------------------");
        System.out.format("| %7s | %7s | %12s |\n", "SIDE", "TIMES", "PROBABILITY");
        System.out.println("------------------------------------");
        System.out.format("| %7s | %7d | %12s |\n", "side 1", c1, c1*100/n + "%");
        System.out.format("| %7s | %7d | %12s |\n", "side 2", c2, c2*100/n + "%");
        System.out.format("| %7s | %7d | %12s |\n", "side 3", c3, c3*100/n + "%");
        System.out.format("| %7s | %7d | %12s |\n", "side 4", c4, c4*100/n + "%");
        System.out.format("| %7s | %7d | %12s |\n", "side 5", c5, c5*100/n + "%");
        System.out.format("| %7s | %7d | %12s |\n", "side 6", c6, c6*100/n + "%");
        System.out.println("------------------------------------");
    }

    // Main method
    public static void main (String args[])
    {
        new ForLoopExercise().init();
    }
}