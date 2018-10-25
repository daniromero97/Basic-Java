import java.util.Scanner;

/*
    Author: Daniel Romero
    Exercise: lunch cost
*/


// Class ArithmeticOperatorsExercise
public class ArithmeticOperatorsExercise
{
    // Constants
    final Scanner in = new Scanner(System.in);

    // Methods
    void form()
    {
        double drinksPrice = 1.65, sandwichPrice = 4.95, totalPrice;
        int drinks, sandwich;

        System.out.print("Write the number of drinks: ");
        while(!in.hasNextInt())
        {
            in.nextLine();
            System.out.println("Wrong value");
            System.out.print("Write the number of drinks: ");
        }
        drinks = in.nextInt();
        in.nextLine();

        System.out.print("Write the number of sandwichs: ");
        while(!in.hasNextInt())
        {
            in.nextLine();
            System.out.println("Wrong value");
            System.out.print("Write the number of sandwichs: ");
        }
        sandwich = in.nextInt();
        in.nextLine();


        totalPrice = (drinksPrice*drinks) + (sandwichPrice*sandwich);

        System.out.println("**** Price ****\n###############");
        System.out.println("Drinks: " + drinksPrice);
        System.out.println("Sandwichs: " + sandwichPrice);
        System.out.println("###############");
        System.out.println("Total: " + totalPrice);

    }


    // Main method
    public static void main (String args[])
    {
        new ArithmeticOperatorsExercise().form();
    }
}

