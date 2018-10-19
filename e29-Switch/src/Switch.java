import java.util.Scanner;

/*
    Author: Daniel Romero
    Exercise: digit
*/


// Class Switch
public class Switch
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

        if (a>9) s = "The value is greater than nine";
        else if (a<0) s = "The value is negative";
        else
        {
            switch (a)
            {
                case 0: s = "Zero"; break;
                case 1: s = "One"; break;
                case 2: s = "Two"; break;
                case 3: s = "Three"; break;
                case 4: s = "Four"; break;
                case 5: s = "Five"; break;
                case 6: s = "Six"; break;
                case 7: s = "Seven"; break;
                case 8: s = "Eight"; break;
                case 9: s = "Nine"; break;
                default: s = "NA";
            }
        }

        System.out.println(s);
    }

    // Main method
    public static void main (String args[])
    {
        new Switch().init();
    }
}