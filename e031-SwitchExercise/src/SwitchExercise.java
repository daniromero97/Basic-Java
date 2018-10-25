import java.util.Scanner;

/*
    Author: Daniel Romero
    Exercise: roman numbers
*/


// Class SwitchExercise
public class SwitchExercise
{
    // Constants
    final Scanner in = new Scanner(System.in);

    // Methods
    void init()
    {
        int a;
        String s = "";

        System.out.print("Write a value: ");
        while(!in.hasNextInt())
        {
            in.nextLine();
            System.out.println("Wrong value");
            System.out.print("Write a value: ");
        }
        a = in.nextInt();
        in.nextLine();

        if (a > 999 || a<1) s = "Incorrect value";
        else
        {
            int v = a % 10;
            switch (v)
            {
                case 1: s="I"; break;
                case 2: s="II"; break;
                case 3: s="III"; break;
                case 4: s="IV"; break;
                case 5: s="V"; break;
                case 6: s="VI"; break;
                case 7: s="VII"; break;
                case 8: s="VIII"; break;
                case 9: s="IX"; break;
                default: s="";
            }

            v = a /10 % 10;
            switch (v)
            {
                case 1: s="X" + s; break; // 10
                case 2: s="XX" + s; break; //20
                case 3: s="XXX" + s; break;
                case 4: s="XXXX" + s; break;
                case 5: s="L" + s; break;
                case 6: s="LX" + s; break;
                case 7: s="LXX" + s; break;
                case 8: s="LXXX" + s; break;
                case 9: s="LXXXX" + s; break; //90
                default: s="" + s;
            }

            v = a /100 % 10;
            switch (v)
            {
                case 1: s="C" + s; break; // 100
                case 2: s="CC" + s; break; //200
                case 3: s="CCC" + s; break;
                case 4: s="CCCC" + s; break;
                case 5: s="D" + s; break;
                case 6: s="DC" + s; break;
                case 7: s="DCC" + s; break;
                case 8: s="DCCC" + s; break;
                case 9: s="DCCCC" + s; break; //900
                default: s="" + s;
            }

            v = a /1000 % 10;
            switch (v)
            {
                case 1: s="M" + s; break; // 1000
                case 2: s="MM" + s; break; //2000
                case 3: s="MMM" + s; break;
                default: s="" + s;
            }
        }

        System.out.println(s);
    }

    // Main method
    public static void main (String args[])
    {
        new SwitchExercise().init();
    }
}