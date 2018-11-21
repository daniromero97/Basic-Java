### Data entry by console

- The data entry by console will be done using the Scanner class that is in the library or "java.útil" package.
- A global constant of Scanner type will be defined with the initial value of the input file of the console:
    ```
    final Scanner in = new Scanner(System.in);
    ```    
- You will have to import that class into the application in the following way:
    ```
    import java.util.Scanner;
    ```
- The way to read data of basic types of strings will be done with the "next" methods defined in that Scanner class.
- Data of type "float" and "doublé" must be entered with decimal point instead of decimal point.
- In the case that when requesting a data type a sequence of characters that does not correspond to that primitive type is introduced or it is a value that is outside the range of said primitive type, an exception will be thrown.
- To avoid this, you can use the "hasNext" methods of the "Scanner" class in the following way to read values ​​of primitive Numeric or Boolean types.
    - Example:
        ```
        while(!in.hasNextDouble()) in.next();
        height = in.nextDouble();
        ```    
    - While the following sequence of characters can not be converted to a double precision real number, that sequence of characters will be read.


### Formatted data output
- The values ​​of primitive types and strings can be displayed by console formatted using the format method of the System.out class.
- The format method has the following syntax:   System.out.format ("Format string", v1, ..., vn);
- The format string is composed of texts and elements.
- For each element of the format string there will be a value to be displayed with the format indicated in that element.
- So, v1 will be the value that will be shown with the format of the first element that appears in the format string, and so on.
- The value can be a literal, constant, variable or type expression indicated in its corresponding format element.
    - Example: 
        ```
        System.out.format("My name is% -10s and I have% 04d years", "Dani", 21);
        ``` 
    - In the format chain there are two elements. The value "Dani" is associated with the element% -10s and the value 21 is associated with the element% 04d.
    - The first element indicates that a chain will be displayed occupying 10 spaces and adjusting the value of the chain to the left.
    - The second element indicates that is going to show an integer value occupying 4 spaces, adjusted by the right and filling with 0 from the left until completing the space occupied by the whole.
    - The format of an element is the following:
        - %[Flags][Size][Converter]
        - Every format of an element begins with '%' and ends with a converter, and optionally can have one or more flags and a size.
        
        | Flags | Size | Converter     | Type value |
        |-------|------|---------------|------------|
        |   0   | n    | o             | byte       |
        |   +   |      | h (no flag 0) | short      |
        |   (   |      | d             | int        |
        |   -   |      | x             | long       |
        |   -   | n    | b             | boolean    |
        |       |      |               |            |
        |   -   | n    | c             | char       |
        |       |      |               |            |
        |   0   | n    | a             | float      |
        |   +   | 1.m  | e             | double     |
        |   (   | n.m  | f             |            |
        |   -   |      | g             |            |
        |   ,   |      |               |            |
        |       |      |               |            |
        |   -   | n    | s             | String     |

        #### Flags
        |   |                                                                                                                                 |
        |---|---------------------------------------------------------------------------------------------------------------------------------|
        | 0 |  Fill in with 0 on the left until the size is complete. Only valid for numerical primitive types.                               |
        | + |  The + sign will be shown for the positives. Only valid for numerical primitive types.                                          |
        | ( |  Negative values ​​will be placed in parentheses and the '-' sign will not be displayed. Only valid for numeric primitive types.  |
        | , |  The decimal character corresponding to the geographical area will be displayed. Only valid for real numerical primitive types. |
        | - |  The value will be adjusted to the left (default is set to the right)                                                           |

        #### Sizes
        |     |                                                                                                                                                                                                         |
        |-----|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
        | n   |  The value will occupy a total of n spaces (if the value occupies more spaces, it would be displayed in its entirety).                                                                                  |
        | n.m |  The value will occupy n spaces and will be shown with decimal places. It may be that n is less than m. The real value is shown rounded to "m" decimals. Only valid for real numerical primitive types. |
                
        #### Converters
        |   |                                                                              |
        |---|------------------------------------------------------------------------------|
        | o |  The integer value is shown in octal.                                        |
        | h |  The integer value is shown in hexadecimal (does not allow flag 0)           |
        | x |  The integer value is shown in hexadecimal                                   |
        | d |  The integer value is shown in base 10.                                      |
        | b |  Converter for the boolean primitive type.                                   |
        | c |  Converter for the primitive type char                                       |
        | s |  Converter for chains                                                        |
        | n |  Line break (does not support flags or size, and has no associated value)    |
        | % |  Shows the '%' (does not support flags or size, and has no associated value) |
        | a |  The actual value is shown in hexadecimal                                    |
        | e |  The real value is shown in scientific notation                              |
        | f |  The actual value is shown in decimal notation                               |
        | g |  The actual value is shown in scientific or decimal notation                 |
                       
        - The converters a, b, c, e, g, h, s, x can be capitalized, showing the letters that have the value in upper case.

        ### Most common converters
        |      |                                           |
        |------|-------------------------------------------|
        | b, B |  Boolean converter                        |
        | c, C |  Character converter                      |
        | d    |  The whole value is shown base 10         |
        | f    |  The actual value is displayed in decimal |
        | s, S |  Chain converter                          |
                
    - You can also use the "String.format" method to generate a formatted string without displaying by console.
        ```
        s = String.format("My name is %-10s and i %04d years old", "Dani", 21);
        ```

