- The counters are global or local variables initialized to 0 and used for a count.
- Example:
    ```
    int a = 2, b = 4, c = 7, counter = 0;

    if(a%2==0) counter++;
    if(b%2==0) counter++;
    if(c%2==0) counter++;

    System.out.println("Even: " + counter);
    ```