import java.io.*;
import java.util.ArrayList;

/*
    Author: Daniel Romero
    Exercise: Files
*/


// Class Main
public class Main
{
    // Methods
    void init()
    {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("This");
        arrayList.add("is");
        arrayList.add("a");
        arrayList.add("test");
        writeFile(new File("src/test.txt"), arrayList);

        String info = readFile(new File("src/test.txt"));
        System.out.println(info);
    }

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

    public void writeFile(File file, ArrayList<String> info)
    {
        FileWriter fileWriter = null;
        PrintWriter printWriter;
        try
        {
            fileWriter = new FileWriter(file.getPath(), true);
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


    // Main method
    public static void main (String args[])
    {
        new Main().init();
    }
}
