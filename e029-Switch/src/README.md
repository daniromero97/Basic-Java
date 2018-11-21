- Syntactically, the "switch" instruction is defined as follows:
    ```
    switch (expression)
    {
        case v1:
            instruction11;
            ...
            instruction1N;
            break;
        case v2:
            instruction21;
            ...
            Instruction2N;
            break;
        ...
        case vM:
            instructionM1;
            ...
            InstruccionMN;
            break;
        default:
            instructionD1;
            ...
            instruccionDN;
    }
    ```
    
- The expression "expression" is evaluated, whose result must be of type int, char or string, and it is checked successively if it coincides with any of the values "v1", "v2", etc.
- The first coincidence that is true, all the instructions that follow the ":" of the matching value are executed, until the next "break" or "}".
- If it does not match any of the values, all the instructions following "default:" are executed.