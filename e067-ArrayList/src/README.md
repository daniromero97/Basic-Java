- In Java there is a generic class "ArrayList" defined in the package "java.util", which allows to store objects of any type in the form of a dynamic array.
- Most used:
    ```
    ArrayList v = new ArrayList();
    ```
    
    ##### Add an element to "v" by the end:
    ```
    v.add(n);
    ```
    
    ##### Add an element to "v" in "a" position:
    ```
    v.add(a, n);
    ```
    
    ##### Get the number of items that "v" has:
    ```
    v.size()
    ```
    
    ##### Get variable stored in the "i" position of "v":
    ```
    n = v.get(i);
    ```
    
    ##### Delete the value of "v" that occupies position "n" :
    ```
    a = v.remove(n);
    ```
    
    ##### Remove the values ​​of "v" that are between positions "a" included and "b" excluded:
    ```
    v.removeRange(a, b);
    ```
    
    ##### Modify the value stored in "v" in position "a" by the value "n":
    ```
    v.set(a, n);
    ```
    
    ##### Empty "v":
    ```
    v.clear();
    ```
    
    ##### Clone "v":
    ```
    v.clone();
    ```
    
    ##### Check if "v" contains "a":
    ```
    v.contains(a);
    ```
    
    ##### Find the position of the first occurrence of "a" in "v" or -1 if it does not exist:
    ```
    v.indexOf(a);
    ```
    
    ##### Find the position of the last occurrence of "a" in "v" or -1 if it does not exist:
    ```
    v.lastIndexOf(a);
    ```
   
- Oficial documentation: https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html