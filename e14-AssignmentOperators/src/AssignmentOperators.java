import java.util.Scanner;

/*
    Author: Daniel Romero
    Exercise: assignment operators
*/


// Class OperatorComparison
public class AssignmentOperators
{
    // Constants
    final Scanner in = new Scanner(System.in);

    // Methods
    void init()
    {
        int num1, num2, aux;

        System.out.print("Write a value (int): ");
        while(!in.hasNextInt())
        {
            in.nextLine();
            System.out.println("Wrong value");
            System.out.print("Write a value (int): ");
        }
        num1 = in.nextInt();
        in.nextLine();

        System.out.print("Write a value (int): ");
        while(!in.hasNextInt())
        {
            in.nextLine();
            System.out.println("Wrong value");
            System.out.print("Write a value (int): ");
        }
        num2 = in.nextInt();
        in.nextLine();

        System.out.println(num1 + "+=" + num2 + ": " + (aux = num1 + num2));
        System.out.println(num1 + "-=" + num2 + ": " + (aux = num1 - num2));
        System.out.println(num1 + "*=" + num2 + ": " + (aux = num1 * num2));
        System.out.println(num1 + "/=" + num2 + ": " + (aux = num1 / num2));
        System.out.println(num1 + "%=" + num2 + ": " + (aux = num1 % num2));
        System.out.println(num1 + "&=" + num2 + ": " + (aux = num1 & num2));
        System.out.println(num1 + "|=" + num2 + ": " + (aux = num1 | num2));
        System.out.println(num1 + "^=" + num2 + ": " + (aux = num1 ^ num2));
        System.out.println(num1 + "<<=" + num2 + ": " + (aux = num1 << num2));
        System.out.println(num1 + ">>=" + num2 + ": " + (aux = num1 >> num2));
        System.out.println(num1 + ">>>=" + num2 + ": " + (aux = num1 >>> num2));
    }


    // Main method
    public static void main (String args[])
    {
        new AssignmentOperators().init();
    }
}
