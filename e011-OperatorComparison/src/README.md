- The result of a compounding operation is true or false.

    | OPERATOR | USE   | OPERATION       |
    |----------|-------|-----------------|
    |   <      | a<b   | less            |
    |   >      | a>b   | higher          |
    |   <=     | a<=b  | less or equal   |
    |   >=     | a>=b  | higher or equal |
    |   ==     | a==b  | equal           |
    |   !=     | a!=b  | different       |

- Example:
    ```
    int a = 10; b = 5; c = 2;
    boolean d = false;

    System.out.println(a > b*c)   // output: false
    System.out.println(d == (a >b*c))   // output: true
    ```