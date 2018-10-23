- The "try-catch" statement is defined syntactically as follows:

      try
      {
        instruction1;
        ...
        InstructionN;
      }
      catch (TypeException1 e1)
      {
        instructionsE1;
      }
      ...
      catch (TypeExceptionN eN)
      {
      instructions;
      }
      finally
      {
        instructionsF;
      }

- The "try-catch" statement evaluates in the following way:
    * If any of the instructions within the "try" keys causes an error, then the instruction is stopped executing the following one and the "try" is followed,
    and the first "catch" whose type of exception matches the one that was launched.
    * If it is found, then the corresponding instructions in that "catch" are executed, and they end up doing the instructions in the "finally";
    * If it will not be found, the exception is thrown to the point where the method containing said "try-catch" instruction was invoked.