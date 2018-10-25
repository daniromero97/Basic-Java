import java.util.Scanner;

/*
    Author: Daniel Romero
    Exercise: If statement (even odd)
*/


// Class IfStatement
public class IfStatement
{
    // Constants
    final Scanner in = new Scanner(System.in);

    // Methods
    void init()
    {
        int a;
        String s = "The number is odd";

        System.out.print("Write a value (int): ");
        while(!in.hasNextInt())
        {
            in.nextLine();
            System.out.println("Wrong value");
            System.out.print("Write a value (int): ");
        }
        a = in.nextInt();
        in.nextLine();

        if (a%2 == 0)
        {
            s = "The number is even";
        }
        System.out.println(s);
    }

    // Main method
    public static void main (String args[])
    {
        new IfStatement().init();
    }
}