import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
    Author: Daniel Romero
    Exercise: regular expressions
*/


// Class RegularExpressions
public class RegularExpressions
{
    // Methods
    void init()
    {
        String evaluate = "Hello world!!";

        String regex1 = "Hello";
        String regex2 = "hello";
        String regex3 = "[GHi][abcde]llo";
        String regex4 = "[ghi][abcde]llo";
        String regex5 = "[^abc][aeiou][^aeiou]";

        Pattern pattern = Pattern.compile(regex1);
        Matcher matcher = pattern.matcher(evaluate);
        System.out.println(matcher.find());

        pattern = Pattern.compile(regex2);
        matcher = pattern.matcher(evaluate);
        System.out.println(matcher.find());

        pattern = Pattern.compile(regex3);
        matcher = pattern.matcher(evaluate);
        System.out.println(matcher.find());

        pattern = Pattern.compile(regex4);
        matcher = pattern.matcher(evaluate);
        System.out.println(matcher.find());

        pattern = Pattern.compile(regex5);
        matcher = pattern.matcher(evaluate);
        System.out.println(matcher.find());
    }

    // Main method
    public static void main (String args[])
    {
        new RegularExpressions().init();
    }
}