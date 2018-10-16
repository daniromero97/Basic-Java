import java.util.Scanner;

/*
    Author: Daniel Romero
    Exercise: operations with variables
*/


// Class ArithmeticOperators
public class ArithmeticOperators
{
    // Constants
    final Scanner in = new Scanner(System.in);

    // Methods
    void form()
    {
        double a1, a2, res;

        System.out.print("Write the first value: ");
        while(!in.hasNextDouble())
        {
            in.nextLine();
            System.out.println("Wrong value");
            System.out.print("Write the first value: ");
        }
        a1 = in.nextDouble();
        in.nextLine();

        System.out.print("Write the second value: ");
        while(!in.hasNextDouble())
        {
            in.nextLine();
            System.out.println("Wrong value");
            System.out.print("Write the second value: ");
        }
        a2 = in.nextDouble();
        in.nextLine();


        // operations
        res = a1 + a2;
        System.out.println("sum: " + res);

        res = a1 - a2;
        System.out.println("subtraction: " + res);

        res = a1 * a2;
        System.out.println("multiply: " + res);

        res = a1 / a2;
        System.out.println("divide: " + res);

        res = a1 % a2;
        System.out.println("Rest of a division: " + res);


        System.out.println("first value: " + a1);
        a1++;
        System.out.println("increment of first value: " + a1);


        System.out.println("second value: " + a2);
        a2--;
        System.out.println("decrement of second value: " + a2);


        System.out.println("first value: " + a1);
        System.out.println("opposed of first value: " + (-a1));
    }


    // Main method
    public static void main (String args[])
    {
        new ArithmeticOperators().form();
    }
}
