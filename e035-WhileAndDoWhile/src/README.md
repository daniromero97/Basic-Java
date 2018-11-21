- Syntactically the "while" and "do-while" instructions are defined as follows:
    ```
    while (expression)
    {
         instruction1;
         ...
         InstructionN;
    }
    ```
    
    ```
    do{
        instruction1;
        ...
        InstructionN;
    }while(expression)
    ```

- As long as the result of "expression" is true, then each of the instructions enclosed in braces is executed.
- In the case of the "while" instruction, the instructions may not be executed at any time.
- While in the "do-while" statement at least they are executed once.

- It is important that some of the instructions modify variable values so that the value of "expression" can be false; otherwise, the loop would be infinite.

- An alternative to the previous instructions is an infinite loop with an exit condition:
    ```
    while (true) {
         instructionA;
         if (expression) break;
         instructionB;
    }
    ```

- The instructions "instructionA" are executed, it is checked if "expression" is true.
- If true, the infinite loop ends; If it is false, the instructions "instructionB" are executed and the loop starts again.