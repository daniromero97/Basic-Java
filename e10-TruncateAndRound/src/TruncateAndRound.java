import java.util.Scanner;

/*
    Author: Daniel Romero
    Exercise: truncate and round
*/


// Class TruncateAndRound
public class TruncateAndRound
{
    // Constants
    final Scanner in = new Scanner(System.in);

    // Methods
    void form()
    {
        double number;

        System.out.print("Write a decimal number: ");
        while(!in.hasNextDouble())
        {
            in.nextLine();
            System.out.println("Wrong value");
            System.out.print("Write a decimal number: ");
        }
        number = in.nextDouble();
        in.nextLine();


        System.out.println("Truncate: " + (int)Math.floor(number));
        System.out.println("Round: " + (int)Math.round(number));

        System.out.println("Truncate to two decimals: " + Math.floor(number*100)/100.0);
        System.out.println("Round to two decimals: " + Math.round(number*100)/100.0);

        System.out.println("Truncate to hundreds: " +  (int) Math.floor(number/100)*100);
        System.out.println("Round to hundreds: " + (int)Math.round(number/100)*100);

    }


    // Main method
    public static void main (String args[])
    {
        new TruncateAndRound().form();
    }
}