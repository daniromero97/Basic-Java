import java.util.Scanner;

/*
    Author: Daniel Romero
    Exercise: concatenation of data
*/


// Class Concatenation
public class Concatenation
{
    // Constants
    final Scanner in = new Scanner(System.in);

    // Methods
    void form()
    {
        String name, surname, location;
        int age;

        System.out.print("Write your name: ");
        name = in.nextLine();

        System.out.print("Write your surname: ");
        surname = in.nextLine();

        System.out.print("Write your location: ");
        location = in.nextLine();

        System.out.print("Write your age: ");
        while(!in.hasNextInt())
        {
            in.nextLine();
            System.out.println("Wrong age");
            System.out.print("Write your age: ");
        }
        age = in.nextInt();
        in.nextLine();


        System.out.println("My name is " + name + " " + surname + ", i'm " + age + " years old and i live in " + location);
    }


    // Main method
    public static void main (String args[])
    {
        new Concatenation().form();
    }
}
