- Syntactically, the "“if else" instruction is defined as follows:
    ```
    if(expresion) {
        instruccionT1;
        …
        instruccionTN;
    }
    else
    {
       instruccionE1;
        …
        instruccionEN;
    }
    ```
    
    * If the result of "expression" is true, then each of the instructions enclosed between keys that are after the condition are executed.
    * If it is false, then each of the instructions enclosed in currencies that follow the "else" are executed.

    * Keys can be removed if there is only one instruction to execute when the condition is true or false.

    * Possibilities:
        ```
        if(expresion)
            instruccionT;
        else
        {
           instruccionE1;
            …
            instruccionEN;
        }
        ```
        ------------ or -------------
        ```
        if(expresion) {
            instruccionT1;
            …
            instruccionTN;
        }
        else
           instruccionE;
        ```
        ------------ or -------------
        ```
        if(expresion)
            instruccionT;
        else
           instruccionE;
        ```

    * Example:
        ```
        if (a%2==0)
         s = "Even";
        else
         s = "Odd";
        ```