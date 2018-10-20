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
                if ((i==0 && j==0) || (j==0 && i==columns-1) || (i==columns-1 && j==rows-1)) s+="* ";
                else if ((i==columns-1) || (j==0) || (i==j))s+="+ ";
                else if (i>j) s+="a ";
                else s+=" ";
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