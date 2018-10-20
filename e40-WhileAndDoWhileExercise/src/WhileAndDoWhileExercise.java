import java.util.Scanner;

/*
    Author: Daniel Romero
    Exercise: palindrome
*/


// Class WhileAndDoWhileExercise
public class WhileAndDoWhileExercise
{
    // Constants
    final Scanner in = new Scanner(System.in);

    // Methods
    void init()
    {
        int value, value2, b, c = 0;
        String s = "Not palindrome";

        System.out.print("Write a value: ");
        while(!in.hasNextInt())
        {
            in.nextLine();
            System.out.println("Wrong value");
            System.out.print("Write a value: ");
        }
        value = in.nextInt();
        value2 = value;
        in.nextLine();


        while (true)
        {
            b = value % 10;
            value = value /10;
            c = b + c*10;
            if(value==0) break;
        }
        if (value2==c) s = "Palindrome";
        System.out.println(s);
    }

    // Main method
    public static void main (String args[])
    {
        new WhileAndDoWhileExercise().init();
    }
}