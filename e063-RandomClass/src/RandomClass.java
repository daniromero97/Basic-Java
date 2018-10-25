import java.util.Random;

/*
    Author: Daniel Romero
    Exercise: generate random with seed and without seed
*/


// Class RandomClass
public class RandomClass
{
    // Methods
    void init()
    {
        Random r1 = new Random ();
        Random r2 = new Random (100L);

        for (int i=0; i<5; i++)
            System.out.println("r1: " + r1.nextInt(30) + ", r2: " + r2.nextInt(30));
    }

    // Main method
    public static void main (String args[])
    {
        /*
            Observe the numbers generated
            r1 (without seed)
            and r2 (with seed)
         */
        for (int i=0; i<10; i++)
        {
            new RandomClass().init();
            System.out.println("--------------------");
        }
    }
}



