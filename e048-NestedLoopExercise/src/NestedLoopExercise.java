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
                if ((j+i)%2==0) s+=" * ";

                else s=s+" + ";

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