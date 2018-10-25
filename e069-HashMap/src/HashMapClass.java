import java.util.HashMap;
import java.util.Hashtable;

/*
    Author: Daniel Romero
    Exercise: HashMap
*/


// Class HashMapClass
public class HashMapClass
{
    // Methods
    void init()
    {
        HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
        hashMap.put(1, "First");
        hashMap.put(2,"Second");
        hashMap.put(3, null);
        System.out.println(hashMap.get(3));

        try {
            Hashtable<Integer, String> hashtable = new Hashtable<Integer,String>();
            hashtable.put(1, "First");
            hashtable.put(2,"Second");
            hashtable.put(3, null);
            System.out.println(hashtable.get(3));
        }catch (NullPointerException e) {
            System.out.println("Error... Hashtable does not accept null");
        }
    }

    // Main method
    public static void main (String args[])
    {
        new HashMapClass().init();
    }
}