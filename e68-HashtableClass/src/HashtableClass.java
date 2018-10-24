import java.util.Enumeration;
import java.util.Hashtable;

/*
    Author: Daniel Romero
    Exercise: save items in a hashtable and operate with them.
*/



// Class HashtableClass
public class HashtableClass
{
    // Methods
    void init()
    {
        Hashtable ht1 = new Hashtable();
        ht1.put(1, "element 2");
        ht1.put(2, "element 3");
        ht1.put(0, "element 1");
        printItems(ht1);

        ht1.remove(2);
        printItems(ht1);

        System.out.println("\n----- get 1 -----\n" + ht1.get(1));
        ht1.replace(1, "element *new*");
        System.out.println("\n----- get 1 -----\n" + ht1.get(1));

        Hashtable ht2 = (Hashtable) ht1.clone();

        System.out.println("\n----- empty? -----\n" + ht1.isEmpty());
        System.out.println("\n----- size -----\n" + ht1.size());
        ht1.clear();
        System.out.println("\n----- size -----\n" + ht1.size());
        System.out.println("\n----- empty? -----\n" + ht1.isEmpty());

        ht1 = ht2;

        System.out.println("\n----- empty? -----\n" + ht1.isEmpty());
        System.out.println("\n----- size -----\n" + ht1.size());
        ht1.clear();
        System.out.println("\n----- size -----\n" + ht1.size());
        System.out.println("\n----- empty? -----\n" + ht1.isEmpty());
        System.out.println("\n----- size ht2 -----\n" + ht2.size());
        System.out.println("\n----- empty? ht2 -----\n" + ht2.isEmpty());
    }

    void printItems(Hashtable h)
    {
        System.out.println("\n----- print elements -----");
        Enumeration<Integer> keys = h.keys();
        while (keys.hasMoreElements())
        {
            String s = (String) h.get(keys.nextElement());
            System.out.println(s);
        }
    }

    // Main method
    public static void main (String args[])
    {
        new HashtableClass().init();
    }
}