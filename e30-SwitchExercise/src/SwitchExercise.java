import java.util.Scanner;

/*
    Author: Daniel Romero
    Exercise: the day of the week
*/


// Class SwitchExercise
public class SwitchExercise
{
    // Constants
    final Scanner in = new Scanner(System.in);

    // Methods
    void init()
    {
        int day;

        System.out.print("Write a value: ");
        while(!in.hasNextInt())
        {
            in.nextLine();
            System.out.println("Wrong value");
            System.out.print("Write a value: ");
        }
        day = in.nextInt();
        in.nextLine();

        switch (day)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Error of day");
        }
    }

    // Main method
    public static void main (String args[])
    {
        new SwitchExercise().init();
    }
}