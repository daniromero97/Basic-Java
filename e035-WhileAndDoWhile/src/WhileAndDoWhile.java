import java.util.Scanner;

/*
    Author: Daniel Romero
    Exercise: read numbers until you enter a even number
*/


// Class WhileAndDoWhile
public class WhileAndDoWhile
{
    // Constants
    final Scanner in = new Scanner(System.in);

    // Methods
    void init()
    {
        int a;

        do{
            System.out.print("Write a value: ");
            a = in.nextInt();
        }while (a%2!=0);

        System.out.print("--- end of the loop ---");
    }

    // Main method
    public static void main (String args[])
    {
        new WhileAndDoWhile().init();
    }
}