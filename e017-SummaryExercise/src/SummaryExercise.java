import java.util.Scanner;

/*
    Author: Daniel Romero
    Exercise: separation of numbers
*/


// Class SummaryExercise
public class SummaryExercise
{
    // Constants
    final Scanner in = new Scanner(System.in);

    // Methods
    void separation()
    {
        int value, n1, n2, n3, n4, n5, n6;

        System.out.print("Write a value (int): ");
        while(!in.hasNextInt())
        {
            in.nextLine();
            System.out.println("Wrong value");
            System.out.print("Write the value of the variable a: ");
        }
        value = in.nextInt();
        in.nextLine();

        n1 = value/100000;
        value %= 100000;
        n2 = value/10000;
        value %= 10000;
        n3 = value/1000;
        value %= 1000;
        n4 = value/100;
        value %= 100;
        n5 = value/10;
        n6 = value%10;
        
        System.out.println(n1 + " - " + n2 + " - " + n3 + " - " + n4 + " - " + n5 + " - " + n6);
    }

    // Main method
    public static void main (String args[])
    {
        new SummaryExercise().separation();
    }
}