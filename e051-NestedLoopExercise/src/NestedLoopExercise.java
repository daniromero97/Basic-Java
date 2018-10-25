/*
    Author: Daniel Romero
    Exercise: drawing of figures
*/


// Class NestedLoopExercise
public class NestedLoopExercise
{
    void init()
    {
        String s="";
        int rows = 10, columns = 10;

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                if (i==j || i+j==columns-1) s+=" * ";
                else s+="  ";
            }
            s+="\n";
        }

        System.out.println(s);
    }

    // Main method
    public static void main (String args[])
    {
        new NestedLoopExercise().init();
    }
}