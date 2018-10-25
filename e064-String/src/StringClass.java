/*
    Author: Daniel Romero
    Exercise:
*/


// Class StringClass
public class StringClass
{
    // Methods
    void init()
    {
        String s = "  Hello world!!";


        System.out.println("Check if the string is empty: " + s.isEmpty());
        System.out.println("Get the length of the string: " + s.length());
        System.out.println("Remove spaces at the beginning and end: " + s.trim());
        System.out.println("Compare strings: " + s.compareTo("Hello"));
        System.out.println("Check if the chain is equal to another string: " + s.equals("Hello world"));
        System.out.println("Check if the string ends with...: " + s.endsWith("world"));
        System.out.println("Check if a string starts with ...: " + s.startsWith("Hello"));
        System.out.println("Check if the string meets a regular expression: " + s.matches("^j.*"));

        System.out.println("Third character: " + s.charAt(2));
        System.out.println("Convert all characters to upper case: " + s.toUpperCase());
        System.out.println("Convert all characters to lower case: " + s.toLowerCase());
        System.out.println("Concatenate strings: " + s.concat(", Hi all."));
        System.out.println("Obtain a string by replacing a character: " + s.replace('o', 'u'));
        System.out.println("Obtain a string by replacing a string: " + s.replace("Hello", "Bye bye"));
        System.out.println("Get the substring 's2' from the position 2: " + s.substring(2));
        System.out.println("Get the substring 's2' from position 2 to 5: " + s.substring(2, 5));
        System.out.println("Separate a strings into substrings: " + s.split(" "));      // {"Hello", "world!!"}
        System.out.println("Format string: " + String.format("Age %2d, height %5f\n", 21, 1.7f));

        System.out.println("Search a character: " + s.indexOf('o'));
        System.out.println("Search a character from position 3: " + s.indexOf('o', 3));
        System.out.println("Find the last position of a character: " + s.lastIndexOf('o'));
        System.out.println("Find the last position of a character from position 3: " + s.lastIndexOf('o',3));


        /*
            Official
            documentation
         */
        System.out.println("https://docs.oracle.com/javase/9/docs/api/java/lang/String.html");
    }

    // Main method
    public static void main (String args[])
    {
        new StringClass().init();
    }
}