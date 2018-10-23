/*
    Author: Daniel Romero
    Exercise: wrapper classes (converting)
*/


// Class WrapperClasses
public class WrapperClasses
{
    // Methods
    void init()
    {
        // Integer to int
        Integer a = new Integer(5);
        int b = a.intValue();
        int c = a;

        System.out.println(a + ", " + b + ", " + c);


        // int to Integer
        int a2 = 10;
        Integer b2 = Integer.valueOf(a2);
        Integer c2 = a2;

        System.out.println(a2 + ", " + b2 + ", " + c2);
    }

    // Main method
    public static void main (String args[])
    {
        new WrapperClasses().init();
    }
}