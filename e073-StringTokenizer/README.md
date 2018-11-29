# StringTokenizer

- Separate a string into several substrings.
- When creating the object we can specify the separator character.
- If we do not specify it, it will use the characters ("\t", "\n", "\r", "\f") as a separator.

    ```
    StringTokenizer stringTokenizer = new StringTokenizer("This is a test");
    while (stringTokenizer.hasMoreTokens())
        System.out.println(stringTokenizer.nextToken());

    /*
    output:
        This
        is
        a
        test
    */
    ```

- If we want to indicate the separator character, it would be indicated as the second parameter of the constructor.

    ```
    StringTokenizer stringTokenizer2 = new StringTokenizer("This is-a test", "-");
    while (stringTokenizer2.hasMoreTokens())
        System.out.println(stringTokenizer2.nextToken());

    /*
    output:
        This is
        a test
    */
    ```

- And if we also want the separator characters to be returned as tokens, it would be indicated in a third parameter with a boolean type

    ```
    StringTokenizer stringTokenizer3 = new StringTokenizer("This is-a test", "-", true);
    while (stringTokenizer3.hasMoreTokens())
        System.out.println(stringTokenizer3.nextToken());

    /*
    output:
        This is
        -
        a test
    */
    ```