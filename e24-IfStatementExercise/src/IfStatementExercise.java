import java.util.Scanner;

/*
    Author: Daniel Romero
    Exercise: exam score
*/


// Class IfStatementExercise
public class IfStatementExercise
{
    // Constants
    final Scanner in = new Scanner(System.in);

    // Methods
    void init()
    {
        double n;
        String s = "Very bad";

        System.out.print("Write the exam score: ");
        while(!in.hasNextDouble())
        {
            in.nextLine();
            System.out.println("Wrong value");
            System.out.print("Write the exam score: ");
        }
        n = in.nextDouble();
        in.nextLine();

        if (n>2.9 && n<5) s = "Suspense";
        if (n>4.9 && n<6) s = "Good";
        if (n>5.9 && n<8) s = "Well done";
        if (n>7.9 && n<9.5) s = "Outstanding";
        if (n>9.4 && n<=10) s = "Perfect";
        if (n>10 || n<0) s = "Note not valid";

        System.out.println(s);
    }

    // Main method
    public static void main (String args[])
    {
        new IfStatementExercise().init();
    }
}