import java.util.Scanner;

/*
    Author: Daniel Romero
    Exercise: reading data by console
*/


// Class TheConsole
public class TheConsole
{
    // Constants
    final Scanner in = new Scanner(System.in);

    // Methods
    void header()
    {
        final String N = "NOMBRE", A = "AGE", H = "HEIGHT";
        System.out.println("----------------------------------");
        System.out.format("|%-10s | %-8s | %-8s|\n", N, A, H);
        System.out.println("----------------------------------");
    }

    void format(String name, int age, double height)
    {
        System.out.format("|%-10s | %08d | %-8.2f|\n", name, age, height);
    }

    void form()
    {
        String name;
        int age;
        double height;

        System.out.print("\nWrite your name: ");
        name = in.nextLine();

        System.out.print("Write your age: ");
        while(!in.hasNextInt())
        {
            in.nextLine();
            System.out.println("Wrong age");
            System.out.print("Write your age: ");
        }
        age = in.nextInt();
        in.nextLine();

        System.out.print("Write your height: ");
        while(!in.hasNextDouble())
        {
            in.nextLine();
            System.out.println("Wrong height");
            System.out.print("Write your height: ");
        }
        height = in.nextDouble();
        in.nextLine();


        String name2;
        int age2;
        double height2;

        System.out.print("\nWrite your name: ");
        name2 = in.nextLine();

        System.out.print("Write your age: ");
        while(!in.hasNextInt())
        {
            in.nextLine();
            System.out.println("Wrong age");
            System.out.print("Write your age: ");
        }
        age2 = in.nextInt();
        in.nextLine();

        System.out.print("Write your height: ");
        while(!in.hasNextDouble())
        {
            in.nextLine();
            System.out.println("Wrong height");
            System.out.print("Write your height: ");
        }
        height2 = in.nextDouble();
        in.nextLine();


        // show data
        header();
        format(name, age, height);
        format(name2, age2, height2);
    }


    // Main method
    public static void main (String args[])
    {
        new TheConsole().form();
    }
}

