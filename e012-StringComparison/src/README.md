- To compare two strings, are used the methods equals and compareTo.
- The compareTo method is used to perform a natural order (lexical order).

    | OPERATOR   | USE               | OPERATION       |
    |------------|-------------------|-----------------|
    | equals     | a.equals(b)       | equal           |
    |            |                   |                 |
    | compareTo  | a.compareTo(b)>0  | higher          |
    |            | a.compareTo(b)<0  | less            |
    |            | a.compareTo(b)<=0 | less or equal   |
    |            | a.compareTo(b)>=0 | higher or equal |
    |            |                   |                 |
    | !equals    | ! a.equals(b)     | different       |


- Example:
    ```
    String name1 = "Dani", name2 = "David";

    name1.equals(name2);    // output: false
    name1.compareTo(name2)<0    // output: true
    !(name1.equals(name2))  // output: true
    ```