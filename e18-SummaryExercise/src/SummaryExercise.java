import java.util.Scanner;

/*
    Author: Daniel Romero
    Exercise: circle area
*/


// Class SummaryExercise
public class SummaryExercise
{
    // Constants
    final Scanner in = new Scanner(System.in);

    // Methods
    void circle()
    {
        // basic exercise
        double radio, area;

        System.out.print("Write a radio: ");
        while(!in.hasNextDouble())
        {
            in.nextLine();
            System.out.println("Wrong value");
            System.out.print("Write a radio: ");
        }
        radio = in.nextDouble();
        in.nextLine();

        area = Math.PI * (radio * radio);
        area = Math.round(area*100)/100.0;
        System.out.println("Circle radio: " + radio + "m");
        System.out.println("Circle area: " + area + "m");



        // Improve it
        double diameter = 2 * radio;
        diameter = Math.round(diameter*100)/100.0;
        double circumference = 2 * Math.PI * radio;
        circumference = Math.round(circumference*100)/100.0;

        System.out.println("\n\nImprove it\n");
        System.out.format("%-15s  %-8s\n", "PART", "LENGTH");
        System.out.println("###############  ########");
        System.out.format("%-15s  %-8s\n", "Radio", radio + "m");
        System.out.format("%-15s  %-8s\n", "Diameter", diameter + "m");
        System.out.format("%-15s  %-8s\n", "Circumference", circumference + "m");
        System.out.format("%-15s  %-8s\n", "Area", area + "m²");
    }

    // Main method
    public static void main (String args[])
    {
        new SummaryExercise().circle();
    }
}