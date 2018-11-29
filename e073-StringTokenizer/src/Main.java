import java.util.StringTokenizer;

/*
    Author: Daniel Romero
    Exercise: StringTokenizer
*/


// Class Main
public class Main
{
    // Methods
    void init()
    {
        System.out.println("############### 1 ###############");
        StringTokenizer stringTokenizer = new StringTokenizer("This is a test");
        while (stringTokenizer.hasMoreTokens())
            System.out.println(stringTokenizer.nextToken());

        /*
        output:
            This
            is
            a
            test
        */


        System.out.println("############### 2 ###############");
        StringTokenizer stringTokenizer2 = new StringTokenizer("This is-a test", "-");
        while (stringTokenizer2.hasMoreTokens())
            System.out.println(stringTokenizer2.nextToken());

        /*
        output:
            This is
            a test
        */


        System.out.println("############### 3 ###############");
        StringTokenizer stringTokenizer3 = new StringTokenizer("This is-a test", "-", true);
        while (stringTokenizer3.hasMoreTokens())
            System.out.println(stringTokenizer3.nextToken());

        /*
        output:
            This is
            -
            a test
        */
    }

    // Main method
    public static void main (String args[])
    {
        new Main().init();
    }
}