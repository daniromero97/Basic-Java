import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    Author: Daniel Romero
    Exercise: date
*/


// Class Main
public class Main
{
    // Methods
    void init()
    {
        System.out.println("################# 1 #################");
        Date date = new Date();
        System.out.println(date);

        System.out.println(date.getHours());      // obsolete
        System.out.println(date.getMinutes());      // obsolete

        /*
        output:
            Mon Nov 26 9:36:47 CET 2018
            9
            36
        */


        System.out.println("################# 2 #################");
        Date date2 = new Date(118, 10, 26);     // obsolete
        System.out.println(date2);

        /*
        output:
            Mon Nov 26 00:00:00 CET 2018
        */


        System.out.println("################# 3 #################");
        Date date3 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(simpleDateFormat.format(date3));

        /*
        output:
            2018-11-26
        */


        System.out.println("################# 4 #################");
        String my_date = "26 9:39:01 EDT 2018";
        SimpleDateFormat parser = new SimpleDateFormat("d HH:mm:ss zzz yyyy");

        try
        {
            Date d = parser.parse(my_date);
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(simpleDateFormat2.format(d));
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }

        /*
        output:
            2018-11-26
        */
    }

    // Main method
    public static void main (String args[])
    {
        new Main().init();
    }
}
