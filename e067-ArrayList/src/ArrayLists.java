import java.util.ArrayList;
import java.util.Scanner;

/*
    Author: Daniel Romero
    Exercise: make a menu with the options: (enter number, sum even, sum odd, sum all and exit)
*/


// Class ArrayLists
public class ArrayLists
{
    // Constants
    final Scanner in = new Scanner(System.in);
    final String MENU =
            "MENU\n" +
                    "=================\n" +
                    "1. Enter number\n" +
                    "2. Sum even\n" +
                    "3. Sum odd\n" +
                    "4. Sum all\n" +
                    "5. Exit\n" +
                    "=================\n" +
                    "Choose an option.\n";


    // Variables
    ArrayList<Integer> numbers = new ArrayList<Integer>();


    // Methods
    void init()
    {
        switch (printMenu())
        {
            case 1:
                System.out.println("---- OPTION 1 ----");
                enterNumber();
                init();
                break;
            case 2:
                System.out.println("---- OPTION 2 ----");
                evenSum();
                init();
                break;
            case 3:
                System.out.println("---- OPTION 3 ----");
                oddSum();
                init();
                break;
            case 4:
                System.out.println("---- OPTION 4 ----");
                allSum();
                init();
                break;
            case 5:
                System.out.println("---- OPTION 5 ----\n----- EXIT -----");
                break;
            default:
                System.out.println("---- ERROR ----\n");
                init();
                break;
        }
    }

    int printMenu()
    {
        int a;

        System.out.println(MENU);
        while(!in.hasNextInt())
        {
            in.nextLine();
            System.out.println("OPTION: INCORRECT");
            System.out.println(MENU);
        }
        a = in.nextInt();
        in.nextLine();

        return a;
    }

    void enterNumber()
    {
        System.out.println("Enter a number");
        while(!in.hasNextInt())
        {
            in.nextLine();
            System.out.println("Invalid number\nEnter a number");
        }
        numbers.add(in.nextInt());
        in.nextLine();

        System.out.println("\n");
    }

    void evenSum()
    {
        int evenSum = 0;
        for (int i=0; i<numbers.size(); i++)
        {
            if (numbers.get(i)%2==0)
                evenSum+=numbers.get(i);
        }
        System.out.println(evenSum + "\n");
    }

    void oddSum()
    {
        int oddSum = 0;
        for (int i=0; i<numbers.size(); i++)
        {
            if (numbers.get(i)%2!=0)
                oddSum+=numbers.get(i);
        }
        System.out.println(oddSum + "\n");
    }

    void allSum()
    {
        int sum = 0;
        for (int i=0; i<numbers.size(); i++)
            sum+=numbers.get(i);

        System.out.println(sum + "\n");
    }

    // Main method
    public static void main (String args[])
    {
        new ArrayLists().init();
    }
}