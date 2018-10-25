import java.util.Scanner;

/*
    Author: Daniel Romero
    Exercise: optimal change
*/


// Class SummaryExercise
public class SummaryExercise
{
    // Constants
    final Scanner in = new Scanner(System.in);

    // Methods
    void change()
    {
        double change;

        System.out.print("Write the change: ");
        while(!in.hasNextDouble())
        {
            in.nextLine();
            System.out.println("Wrong value");
            System.out.print("Write the change: ");
        }
        change = in.nextDouble();
        in.nextLine();

        change = Math.abs(change);
        change = Math.round(change*100)/100.0;
        System.out.println("### CHANGE: " + change + " ###\nOPTIMAL CHANGE:");

        int n = (int) (change / 500);
        double rest = (change % 500.00);
        System.out.println("500$: " + n);

        n = (int) (rest / 200);
        rest = rest % 200.00;
        System.out.println("200$: " + n);

        n = (int) (rest / 100);
        rest = rest % 100.00;
        System.out.println("100$: " + n);

        n = (int) (rest / 50);
        rest = rest % 50.00;
        System.out.println("50$: " + n);

        n = (int) (rest / 20);
        rest = rest % 20.00;
        System.out.println("20$: " + n);

        n = (int) (rest / 10);
        rest = rest % 10.00;
        System.out.println("10$: " + n);

        n = (int) (rest / 5);
        rest = rest % 5.00;
        System.out.println("5$: " + n);

        n = (int) (rest / 2);
        rest = rest % 2.00;
        System.out.println("2$: " + n);

        n = (int) (rest / 1);
        rest = rest % 1.00;
        System.out.println("1$: " + n);

        n = (int) (rest / 0.5);
        rest = rest % 0.50;
        System.out.println("0.50$: " + n);

        n = (int) (rest / 0.2);
        rest = rest % 0.20;
        System.out.println("0.20$: " + n);

        n = (int) (rest / 0.1);
        rest = rest % 0.10;
        System.out.println("0.10$: " + n);

        n = (int) (rest / 0.05);
        rest = rest % 0.05;
        System.out.println("0.05$: " + n);

        n = (int) (rest / 0.02);
        rest = rest % 0.02;
        System.out.println("0.02$: " + n);

        n = (int) (rest / 0.01);
        rest = rest % 0.01;
        System.out.println("0.01$: " + n);
    }

    // Main method
    public static void main (String args[])
    {
        new SummaryExercise().change();
    }
}