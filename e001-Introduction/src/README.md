### Identifiers.

- An identifier is a word that represents elements of a programming language (variables, constants, names of methods, reserved words, ect).
- In java an identifier is defined as follows:
    * Start with a letter, an underscore (_) or a dollar symbol ($). The following characters can be letters, digits and underscore.
    * Uppercase letters are distinguished from lowercase letters.
    * There is no maximum length established for the identifier.

### Reserved words.
- The reserved words are predefined identifiers that have a meaning for the compiler and therefore can not be used as identifiers created by the user in the programs.
- Words reserved in Java:

        abstract, continue, for, new, switch,
        assert, default, goto, package, synchronized,
        boolean, do, if, private, this,
        break, double, implements, protected, throw,
        byte, else, import, public, throws,
        case, enum, instanceof, return, transient,
        catch, extends, int, short, try,
        char, final, interface, static, void,
        class, finally, long, strictfp, volatile,
        const, float, native, super, while.

### Workspace, packages, classes and applications.
- A workspace is a directory where applications, classes, libraries and resources will be created.
- An application in Java is made up of one or more classes. Classes are codes written in Java with a name that are stored in the workspace or in a subdirectory of that workspace.
- The name of the file (HelloWorld.java) must match the name of the class (HelloWorld) and the first letter must be uppercase.
- There must be a class that contains the main method of starting the application. ("public static void main (String args[]) {}")
- The class that contains the main method is called "Main-Class".

### Console applications and methods.
- A console application consists of a program that reads and show data by the operating system console.
- A method is a series of instructions with a name, for example "init", which may or may not have input data, for example "()" denotes that it has no input data, and may or may not return a result, for example "void" denotes that it does not return anything.
- To show "Hello world!" by console the instruction is written:
    ```
    System.out.println ("Hello world!");
    ```    
- For the instructions of a method to be executed, this method must be invoked from another method, for example: init().
- In the case of being invoked in a main method, such as in the class "HelloWorld", the instruction would be:
    ```
    new HelloWorld().init();
    ```
    
### Comments.
- In a source code or program comments can be written in Java so that the compiler will discard such lines at the time of compilation.
- The comments help to understand the program code.
- There are two types of comments:
    * In one line, with "// comment", example:
        ```
        // comment in one line
        ```
    * Multiple lines, with "/* comment */", example:
        ```
        /*
            comments in
            more than
            one line
        */
        ```

