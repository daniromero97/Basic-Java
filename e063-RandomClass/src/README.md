- The "Random" class defined in the "java.util" package allows you to generate random numbers.
- Some examples of creation and methods of the Random class would be the following:
    - Create a "Random" object
        ```
        Random r = new Random ();
        r = new Random (100L);        // random seed 100L
        ```
        
    - Generate random numbers
        ```
          r.nextBoolean ()              // false or true random
          r.nextInt ()                  // 0 to 231-1 random
          r.nextInt (10)                // 0 to 9 random
          r.nextLong ()                 // 0 to 263-1 random
          r.nextFloat ()                //0.0 to 1.0 random
          r.nextDouble ()               //0.0 to 1.0 random
          r.nextGaussian ()             // N (0,1) random
        ```
        
    - Modify the random seed
        ```
          r.setSeed (154232L);          // random seed the 154232L
        ```
        
    - Generate integer random numbers between "a" and "b" both inclusive (a <= b)
        ```
          r.nextInt (b-a + 1) + a
        ```
        
    - Generate real random numbers between the integers "a" and "b" both inclusive (a <= b)
        ```
          r.nextDouble () * (b-a) + a
        ```