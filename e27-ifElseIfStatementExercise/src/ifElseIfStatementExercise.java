import java.util.Scanner;

/*
    Author: Daniel Romero
    Exercise: first positive and negative
*/


// Class ifElseIfStatementExercise
public class ifElseIfStatementExercise
{
    // Constants
    final Scanner in = new Scanner(System.in);

    // Methods
    void init()
    {
        double a, b, c, d, e;
        boolean positive = false, negative = false;

        System.out.print("Write a value: ");
        while(!in.hasNextDouble())
        {
            in.nextLine();
            System.out.println("Wrong value");
            System.out.print("Write a value: ");
        }
        a = in.nextDouble();
        in.nextLine();

        System.out.print("Write a value: ");
        while(!in.hasNextDouble())
        {
            in.nextLine();
            System.out.println("Wrong value");
            System.out.print("Write a value: ");
        }
        b = in.nextDouble();
        in.nextLine();

        System.out.print("Write a value: ");
        while(!in.hasNextDouble())
        {
            in.nextLine();
            System.out.println("Wrong value");
            System.out.print("Write a value: ");
        }
        c = in.nextDouble();
        in.nextLine();

        System.out.print("Write a value: ");
        while(!in.hasNextDouble())
        {
            in.nextLine();
            System.out.println("Wrong value");
            System.out.print("Write a value: ");
        }
        d = in.nextDouble();
        in.nextLine();

        System.out.print("Write a value: ");
        while(!in.hasNextDouble())
        {
            in.nextLine();
            System.out.println("Wrong value");
            System.out.print("Write a value: ");
        }
        e = in.nextDouble();
        in.nextLine();


        if (a>0 && a!=0)
            System.out.println("first positive: " + a);
        else if(b>0 && b!=0)
            System.out.println("first positive: " + b);
        else if(c>0 && c!=0)
            System.out.println("first positive: " + c);
        else if(d>0 && d!=0)
            System.out.println("first positive: " + d);
        else if(e>0 && e!=0)
            System.out.println("first positive: " + e);
        else
            System.out.println("first positive: " + 0);

        if (a<0 && a!=0)
            System.out.println("first negative: " + a);
        else if(b<0 && b!=0)
            System.out.println("first negative: " + b);
        else if(c<0 && c!=0)
            System.out.println("first negative: " + c);
        else if(d<0 && d!=0)
            System.out.println("first negative: " + d);
        else if(e<0 && e!=0)
            System.out.println("first negative: " + e);
        else
            System.out.println("first negative: " + 0);

    }

    // Main method
    public static void main (String args[])
    {
        new ifElseIfStatementExercise().init();
    }
}