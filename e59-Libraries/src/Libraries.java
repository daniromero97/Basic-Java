import java.util.Scanner;
import myPackage.myLib;

/*
    Author: Daniel Romero
    Exercise: creation and use of a library
*/


// Class Libraries
public class Libraries
{
    // Constants
    final Scanner in = new Scanner(System.in);

    // Methods
    void init()
    {
        int a;

        System.out.print("Write a value: ");
        while(!in.hasNextInt())
        {
            in.nextLine();
            System.out.println("Wrong value");
            System.out.print("Write a value: ");
        }
        a = in.nextInt();
        in.nextLine();

        System.out.println("Even: " + myLib.isEven(a));
        System.out.println("+50%: " + myLib.increaseHalf(a));
    }

    // Main method
    public static void main (String args[])
    {
        new Libraries().init();
    }
}