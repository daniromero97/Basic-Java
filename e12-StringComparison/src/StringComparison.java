import java.util.Scanner;

/*
    Author: Daniel Romero
    Exercise: comparison of strings
*/


// Class StringComparison
public class StringComparison
{
    // Constants
    final Scanner in = new Scanner(System.in);

    // Methods
    void init()
    {
        String s1, s2;

        System.out.print("Write a word: ");
        s1 = in.nextLine();

        System.out.print("Write another word: ");
        s2 = in.nextLine();


        System.out.println("Equals: " + s1.equals(s2));
        System.out.println("Higher: " + (s1.compareTo(s2) > 0));
    }


    // Main method
    public static void main (String args[])
    {
        new StringComparison().init();
    }
}