import java.util.Scanner;

/*
    Author: Daniel Romero
    Exercise: ( -- read example of the information -- )
*/


// Class Signs
public class Signs
{
    // Constants
    final Scanner in = new Scanner(System.in);

    // Methods
    void init()
    {
        int a, b, c, d, e;
        int counter = 0, r = 0;

        System.out.print("Write a value: ");
        while(!in.hasNextInt())
        {
            in.nextLine();
            System.out.println("Wrong value");
            System.out.print("Write a value: ");
        }
        a = in.nextInt();
        in.nextLine();

        System.out.print("Write a value: ");
        while(!in.hasNextInt())
        {
            in.nextLine();
            System.out.println("Wrong value");
            System.out.print("Write a value: ");
        }
        b = in.nextInt();
        in.nextLine();

        System.out.print("Write a value: ");
        while(!in.hasNextInt())
        {
            in.nextLine();
            System.out.println("Wrong value");
            System.out.print("Write a value: ");
        }
        c = in.nextInt();
        in.nextLine();

        System.out.print("Write a value: ");
        while(!in.hasNextInt())
        {
            in.nextLine();
            System.out.println("Wrong value");
            System.out.print("Write a value: ");
        }
        d = in.nextInt();
        in.nextLine();

        System.out.print("Write a value: ");
        while(!in.hasNextInt())
        {
            in.nextLine();
            System.out.println("Wrong value");
            System.out.print("Write a value: ");
        }
        e = in.nextInt();
        in.nextLine();

        if(a%2!=0)
        {
            counter++;
            r+=a;
        }
        if(b%2!=0)
        {
            counter++;
            r+=b;
        }
        if(c%2!=0)
        {
            counter++;
            r+=c;
        }
        if(d%2!=0 && counter<3)
        {
            counter++;
            r+=d;
        }
        if(e%2!=0 && counter<3)
        {
            counter++;
            r+=e;
        }
        if(counter<3)
        {
            r = 0;
        }


        System.out.println(r);
    }

    // Main method
    public static void main (String args[])
    {
        new Signs().init();
    }
}