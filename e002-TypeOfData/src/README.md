### Numeric primitive data types:

| TYPE     | BYTES   | MINIMUM                 | MAXIMUM                  |
|----------|---------|-------------------------|--------------------------|
| byte     | 1       | -128                    | 127                      |
| short    | 2       | -32768                  | 32767                    |
| int      | 4       | -2147483648             | 2147483647               | 
| long     | 8       | -9223372036854775808    | 9223372036854775807      |
| float    | 8       | 1.17549435E-38          | -3.4028235E38            |
|          |         | 3.4028235E38            | -1.17549435E-38          |
| double   | 16      | 2.2250738585072014E-308 | -1.7976931348623157E308  |
|          |         | 1.7976931348623157E308  | -2.2250738585072014E-308 |
    

- In the case of the real numbers float and double the minimum and maximum is indicated for the positive and negative numbers.


### Boolean primitive data type:
    
| TYPE    | BYTES | MINIMUM | MAXIMUM |
|---------|-------|-------- |---------|
| boolean | 1     | false   | true    |  
                
                   
### Character primitive data type:

| TYPE    | BYTES | MINIMUM | MAXIMUM |
|---------|-------|-------- |---------|
| char    | 2     | 0       | 65536   |  

- A character in Java is any symbol of a language.
- There are character tables to represent the characters, among which the ASCII table stands out. The ASCII table allows you to represent a total of 256 characters.
- There are other tables, which expand the ASCII table, to be able to represent all the characters of all the languages. For example, the UTF-8 table that can represent a total of 65536 characters. In Java, this table is used to represent the characters.


### Strings:

- In java you have the data type "String" to represent the sequence of characters.
- In string literals you can put escape or unicode characters:
- Example:      "Hello \nWorld"


### Constants:

- A constant is a value of a type with a name that can not be modified during the execution of the program.
- His name is written by convention in capital letters.
- "final" indicates that it is a constant.
- Example:
    ```
    final int ZERO = 0
    final String NAME = "Daniel";
    final char LETTER_A = 'A';
    final float MAXIMUM_WEIGHT = 150F;
    ```    
- Constants can be defined within the class (global constants accessible in all methods) or within a method (local constants accessible only within the method where they are defined).
- Within a class and a method you can not define two constants with the same name.
- You can define a constant with the same name as global and local in one or more methods.
- The way to access a constant (global or local) in a method is by referencing its name.
- The maximum and minimum values ​​of each of the numeric and character primitive data types are stored in the following constants:
       
    ```
    Byte.MIN_VALUE   Byte.MAX_VALUE
    Short.MIN_VALUE   Short.MAX_VALUE
    Integer.MIN_VALUE   Integer.MAX_VALUE
    Long.MIN_VALUE   Long.MAX_VALUE
    Float.MIN_NORMAL Float.MIN_VALUE   Float.MAX_VALUE
    Double.MIN_NORMAL Double.MIN_VALUE   Double.MAX_VALUE
    (int) Character.MIN_VALUE   (int) Character.MAX_VALUE
    ```


### Variables:

- A variable is a value of a type with a name (identifier) ​​that has an initial value that can be modified during the execution of the program.
- Variables can be global if they are defined within the class or premises if they are defined within a method.
- Those variables that are not assigned an initial value, take the default value of the type as the initial value.
- You can declare and initialize multiple variables of the same type in a single instruction.
- You can not declare variables with the same name within the class or within a method; but there may be variables with the same name in the class and in the methods.
- The modifications that the local variable suffers do not affect the global variable with the same name.
- The way to access a variable (global or local) in a method is by referencing its name.



