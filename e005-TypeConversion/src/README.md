- To assign to a variable the value of another variable of type "superior", the value to be assigned to the type of the target variable must be converted with the type conversion operator.
    ```
    int numero = 0;
    float valor = 0f;
    char letra = 'a';
    double peso = 64.7;
    ```
    
- To assign the value of the variable to the other three variables, the following assignment instructions would be made:

    ```
    numero = (int) peso;  // int < double
    letra = (char) peso; // char < double
    valor = (float) peso; // float < double
    ```
    
- By using the type converter, accuracy may be lost. In the previous example, the value of the weight variable is converted to integer or character by truncating it; while when converting it to real simple, no precision is lost.
- We have the following conversion operators of type: (double), (float), (long), (int), (short), (byte), (char).
