/*
    Author: Daniel Romero
    Exercise: try catch
*/


// Class TryCatch
public class TryCatch
{
    // Methods
    void init()
    {
        int a,b;

        for(int i=0; i<100;i++)
        {
            a=(int)(Math.random()*11)-5;
            b=(int)(Math.random()*11)-5;
            try
            {
                System.out.println(a + "/" + b + " = " + (a/b));
            }
            catch(ArithmeticException e)
            {
                System.out.println(a + "/" + b + " -> " + "Can not be divided by zero");
            }
            catch(Exception e)
            {
                System.out.println("Unexpected error");
            }
        }

    }

    // Main method
    public static void main (String args[])
    {
        new TryCatch().init();
    }
}