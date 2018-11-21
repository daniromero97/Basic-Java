- Use of the "+" operator to join two chains.
    ```
    String name = "Gonzalo";
    String surnames = "García Herrera";
    String result = "";
    ```
    - The following assignment statement:
        ```
        result = name + " " + surnames;
        ```
    - Stores in "result" the string "Gonzalo García Herrera".

- You can also concatenate primitive types of java.
    ```
    int a = 10;
    float b = 5.7f;
    boolean c = true;
    char d = 'd';
    String result = "";
    
    result = "A = " + a + ", B = " + b + ", C = " + c + ", D = " + d;
    ```
    - You would get the string "A = 10, B = 5.7, C = true, D = d".

- String concatenation is usually used to display data by console, since the println and print method allow expressions of primitive and string types, so that the number of times these methods are invoked is reduced.
