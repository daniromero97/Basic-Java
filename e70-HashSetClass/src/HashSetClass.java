import java.util.HashSet;

/*
    Author: Daniel Romero
    Exercise: HashSet
*/


// Class HashSetClass
public class HashSetClass
{
    // Methods
    void init()
    {
        HashSet<String> hashSet= new HashSet<String>();
        hashSet.add("First");
        hashSet.add("Second");
        hashSet.add("Third");
        hashSet.add(null);
        hashSet.add("First");
        hashSet.add("Second");
        hashSet.add("Third");
        hashSet.add(null);

        System.out.println(hashSet + "\n");

        Object[] a = hashSet.toArray();
        for (int i=0; i<a.length; i++)
            System.out.println(a[i]);
    }

    // Main method
    public static void main (String args[])
    {
        new HashSetClass().init();
    }
}