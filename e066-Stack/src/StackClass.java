import java.util.Stack;

/*
    Author: Daniel Romero
    Exercise: handling of stacks
*/


// Class StackClass
public class StackClass
{
    // Methods
    void init()
    {
        Stack<String> st = new Stack<String>();

        st.push("push 1");
        st.push("push 2");
        st.push("push 3");
        st.push("push 4");

        for (int i=0; i<st.size(); i++)
            System.out.println("peek: " + st.peek());

        System.out.println("------------------");

        while(!st.isEmpty())
            System.out.println("pop: " + st.pop());
    }

    // Main method
    public static void main (String args[])
    {
        new StackClass().init();
    }
}