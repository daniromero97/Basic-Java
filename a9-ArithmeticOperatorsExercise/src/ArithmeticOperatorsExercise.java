import java.util.Scanner;

/*
    Author: Daniel Romero
    Exercise: second converter
*/


// Class ArithmeticOperatorsExercise
public class ArithmeticOperatorsExercise
{
    // Constants
    final Scanner in = new Scanner(System.in);

    // Methods
    void form()
    {
        int seconds, minutes, hours, totalSeconds;

        System.out.print("Write the total seconds: ");
        while(!in.hasNextInt())
        {
            in.nextLine();
            System.out.println("Wrong value");
            System.out.print("Write the total seconds: ");
        }
        totalSeconds = in.nextInt();
        in.nextLine();

        
        seconds = totalSeconds % 60;
        minutes = (totalSeconds%3600) / 60;
        hours = totalSeconds / 3600;

        System.out.println("**** Second converter ****");
        System.out.println(hours + " Hours");
        System.out.println(minutes + " Minutes");
        System.out.println(seconds + " Seconds");
    }


    // Main method
    public static void main (String args[])
    {
        new ArithmeticOperatorsExercise().form();
    }
}
