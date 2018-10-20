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
        int rows = 11, columns = 11;

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                if (i==rows/2 || j==columns/2) s+=" + ";
                else s+=" * ";
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