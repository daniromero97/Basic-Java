- The libraries allow having methods that can be invoked in other applications.
- To create a library, a class is created, for example with the name "MyLib", in a "myPackage" package.

      package myPackage;
      public class MyLib
      {

      }


- The methods defined in a library are similar to those already seen but with two differences:
    * Global variables can not be accessed.
    * The definition of the method begins with the reserved words "public static".

    * An example of a library method that determines if a number is even would be the following:
          public static boolean isEven (int a)
          {
                return a%2 == 0;
          }


- To be able to use the methods of the library "MyLib" in an application you only have to import the library with the instruction:
      import myPackage. *;
      or
      import myPackage.MyLib;


- Within any method defined in the application, the methods of the library are accessed by prefixing the name of the method with the prefix "MyLib.".
    * For example:
          if (MyLib.isEven(a))
          {
            ...
          }


- In addition to the "MyLib" class of the "myPackage" package, other libraries can be created with other class names and in other packages.