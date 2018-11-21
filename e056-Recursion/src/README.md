- Recursive methods are methods that you call yourself within your body.
- In the body of such methods a trivial problem is solved, and the rest of problems are solved in function of simpler problems that end up invoking trivial problems.

- Example:
    ```
    int factorial(int n)
    {
        if(n<=0) return 1;
        return n*factorial(n-1);
    }
    ```