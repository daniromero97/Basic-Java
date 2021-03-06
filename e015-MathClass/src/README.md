- The Math class contains methods for performing basic numeric operations such as the elementary exponential, logarithm, square root, and trigonometric functions.
- It is observed that in this library there are methods with the same name (abs, min, max, etc) but that they have different types of parameters.
- Depending on the type of parameters, one method or another will be invoked.
- Examples:
    - Returns the absolute value of a value.
        ```
        a = Math.abs(-10);  // a: 10
        ```
        
    - Returns the greater of two values.
        ```
        a = Math.max(10, -5);  // a: 10
        ```
        
    - Returns the value of the first argument raised to the power of the second argument.
        ```
        a = Math.pow(2,4);  // a: 16
        ```
        
    - Returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0.
        ```
        a = Math.random();
        ```

- Official documentation: https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html


