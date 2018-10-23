import java.util.Scanner;

/*
    Author: Daniel Romero
    Exercise: menus
*/


// Class Menus
public class Menus
{
    // Constants
    final Scanner in = new Scanner(System.in);
    final String MENU =
                    "MENU\n" +
                    "=================\n" +
                    "1. One\n" +
                    "2. Two\n" +
                    "3. Three\n" +
                    "4. Four\n" +
                    "5. Exit\n" +
                    "=================\n" +
                    "Choose an option.\n";

    // Methods
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

    void init()
    {
        switch (printMenu())
        {
            case 1:
                System.out.println("---- OPTION 1 ----\n");
                init();
                break;
            case 2:
                System.out.println("---- OPTION 2 ----\n");
                init();
                break;
            case 3:
                System.out.println("---- OPTION 3 ----\n");
                init();
                break;
            case 4:
                System.out.println("---- OPTION 4 ----\n");
                init();
                break;
            case 5:
                System.out.println("---- OPTION 5 ----");
                System.out.println("---- EXIT ----\n");
                break;
            default:
                System.out.println("---- ERROR ----");
                init();
                break;
        }
    }

    // Main method
    public static void main (String args[])
    {
        new Menus().init();
    }
}