/*
    Author: Daniel Romero
    Exercise: throw a die 18 times without each side repeating more than 3 times.
*/


// Class Arrays
public class Arrays
{
    // Methods
    void init()
    {
        int[] limit = new int[6];
        //System.out.println(limit.length);

        for (int i=0; i<18; i++)
        {
            int throwDie = (int) (Math.random()*6 + 1);

            while (limit[throwDie - 1] == 3)
                throwDie = (int) (Math.random()*6 + 1);

            limit[throwDie - 1]++;
            System.out.println("throw: " + i + ", side: " + throwDie);
        }


        System.out.println("\n....... number of times on each side .......");
        for (int i = 0; i<limit.length; i++)
        {
            int side = i+1;
            System.out.println("side: " + side + ", times: " + limit[i]);
        }
    }

    // Main method
    public static void main (String args[])
    {
        new Arrays().init();
    }
}