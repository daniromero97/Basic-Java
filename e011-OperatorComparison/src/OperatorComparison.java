import java.util.Scanner;

/*
    Author: Daniel Romero
    Exercise: comparison of variables
*/


// Class OperatorComparison
public class OperatorComparison
{
    // Constants
    final Scanner in = new Scanner(System.in);

    // Methods
    void init()
    {
        int a;

        System.out.print("Write a value (int): ");
        while(!in.hasNextInt())
        {
            in.nextLine();
            System.out.println("Wrong value");
            System.out.print("Write a value (int): ");
        }
        a = in.nextInt();
        in.nextLine();


        System.out.println("EVEN: " + (a%2 == 0));
        System.out.println("ODD: " + (a%2 != 0));

        System.out.println("Greater than 50: " + (a>50));
        System.out.println("Less than 10 and even: " + ( a<10 == (a%2 == 0) ));
    }


    // Main method
    public static void main (String args[])
    {
        new OperatorComparison().init();
    }
}
