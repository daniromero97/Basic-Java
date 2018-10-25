import java.util.Scanner;

/*
    Author: Daniel Romero
    Exercise: body mass index
*/


// Class IfElseIfStatementExercise
public class IfElseIfStatementExercise
{
    // Constants
    final Scanner in = new Scanner(System.in);

    // Methods
    void init()
    {
        double height, weight, bmi;

        System.out.print("Write the height: ");
        while(!in.hasNextDouble())
        {
            in.nextLine();
            System.out.println("Wrong value");
            System.out.print("Write the height: ");
        }
        height = in.nextDouble();
        in.nextLine();

        System.out.print("Write the weight: ");
        while(!in.hasNextDouble())
        {
            in.nextLine();
            System.out.println("Wrong value");
            System.out.print("Write the weight: ");
        }
        weight = in.nextDouble();
        in.nextLine();


        if (height<0.25) height = 0.25;
        else if(height>2.50) height = 2.50;

        if (weight<1) weight=1;
        else if(weight>300) weight=300;

        bmi = weight / (height*height);
        bmi = Math.round(bmi*100)/100.0;


        System.out.println("Height: " + height + "m\nWeight: " + weight + "kg\nBMI: " + bmi);
    }

    // Main method
    public static void main (String args[])
    {
        new IfElseIfStatementExercise().init();
    }
}