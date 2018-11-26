# Files

- The objective of the use of external files is the persistence of data, another more advanced alternative would be the use of databases that we will see later.
- Next we will see two examples to read and write files.
- The examples are very generic and can be modified to adapt to our needs.

### Read files

- We can read a file using the FileReader class (Another way is through the Scanner class).
- This class has methods that allow us to read characters, but the normal thing is to want to read all the content.
- FileReader does not contain methods that allow us to read complete lines, but BufferedReader. We can build a BufferedReader from a FileReader.
- In the following example we can see a method that receives by parameters a File object and returns the information contained in the file:

    ```
    public String readFile(File file)
    {
        StringBuilder info = new StringBuilder();
        FileReader fileReader = null;
        BufferedReader bufferedReader;

        try
        {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String in;
            while((in = bufferedReader.readLine()) != null)
                info.append(in + "\n");
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Error: File not found");
            System.out.println(e.getMessage());
        }
        catch(Exception e)
        {
            System.out.println("Error: Failed reading");
            System.out.println(e.getMessage());
        }
        finally
        {
            try
            {
                if(fileReader != null)
                    fileReader.close();
            }
            catch (Exception e)
            {
                System.out.println("Error: Fail to close the file");
                System.out.println(e.getMessage());
            }
        }

        return info.toString();
    }
    ```

- The reading and closing of the file can throw exceptions that we must control.


### Write files

- In the following example we can see a method that receives by parameters the path of a file and an arraylist of strings with the information to write:

    ```
    public void writeFile(String path, ArrayList<String> info)
    {
        FileWriter fileWriter = null;
        PrintWriter printWriter;
        try
        {
            fileWriter = new FileWriter(path, true);
            printWriter = new PrintWriter(fileWriter);

            for (String s : info) printWriter.println(s);
        }
        catch (Exception e)
        {
            System.out.println("Error: Failed writing");
            System.out.println(e.getMessage());
        }
        finally
        {
            try
            {
                if (null != fileWriter)
                    fileWriter.close();
            }
            catch (Exception e)
            {
                System.out.println("Error: Fail to close the file");
                System.out.println(e.getMessage());
            }
        }
    }
    ```

- Like in reading, the writing and closing of the file can throw exceptions that we must control.


### Example of use

```
ArrayList<String> arrayList = new ArrayList<>();
arrayList.add("This");
arrayList.add("is");
arrayList.add("a");
arrayList.add("test");
writeFile("src/test.txt", arrayList);

String info = readFile(new File("src/test.txt"));
System.out.println(info);

/*
Output (First execution):
    This
    is
    a
    test
*/
```