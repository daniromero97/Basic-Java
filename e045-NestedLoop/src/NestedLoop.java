/*
    Author: Daniel Romero
    Exercise: paint square
*/


// Class NestedLoop
public class NestedLoop
{
    // Methods
    void init()
    {
        String s="";

        for(int i=0;i<10;i++)
        {
            for(int j=0;j<10;j++)
            {
                if(i==0 || i==9 || j==0 || j==9) s+="* ";
                else s+="  ";
            }
            s+="\n";
        }

        System.out.println(s);
    }

    // Main method
    public static void main (String args[])
    {
        new NestedLoop().init();
    }
}