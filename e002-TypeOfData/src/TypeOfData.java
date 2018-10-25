/*
    Author: Daniel Romero
    Exercise: data management with variables and constants
*/


// Class TypeOfData
public class TypeOfData
{
    // Constants
    final byte EYES = 2;
    final String NAME = "Daniel";
    final char FIRSTLETTER = 'D';

    // Variables
    byte age = 20;
    short ageInDays = 7854;
    int  ageInMinutes = 11309760;
    float height = 1.7f;
    boolean alive = true;


    // Methods
    void properties()
    {
        System.out.println("Eyes: " + EYES
                + "\nName: " + NAME
                + "\nFirs letter: " + FIRSTLETTER
                + "\nAge: " + age
                + "\nAge in days: " + ageInDays
                + "\nAge in minutes: " + ageInMinutes
                + "\nHeight: " + height
                + "\nAlive: " + alive
        );
    }

    void age()
    {
        age = 30;
        byte age = 25;

        // It shows second variable age
        System.out.println("Second age: " + age + " years old");

        // It shows second variable age
        age = 35;
        System.out.println("Second age modified: " + age + " years old");


        /*
            It shows variable age modified
            With this we refer to the global variable
        */
        System.out.println("First variable age modified: " + this.age + " years old");
    }


    // Main method
    public static void main (String args[])
    {
        System.out.println("\n########### initial attributes ###########");
        new TypeOfData().properties();

        System.out.println("\n########### operating with the attributes ###########");
        System.out.println("First variable age in main: " + new TypeOfData().age + " years old");
        new TypeOfData().age();
    }
}
