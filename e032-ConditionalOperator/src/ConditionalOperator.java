import java.util.Scanner;

/*
    Author: Daniel Romero
    Exercise: even or odd
*/


// Class ConditionalOperator
public class ConditionalOperator
{
    // Constants
    final Scanner in = new Scanner(System.in);

    // Methods
    void init()
    {
        int a;
        String s;

        System.out.print("Write a value: ");
        while(!in.hasNextInt())
        {
            in.nextLine();
            System.out.println("Wrong value");
            System.out.print("Write a value: ");
        }
        a = in.nextInt();
        in.nextLine();

        s = (a%2==0)? "even" : "odd";
        System.out.println(s);
    }

    // Main method
    public static void main (String args[])
    {
        new ConditionalOperator().init();
    }
}