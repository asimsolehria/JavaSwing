package its.TextIO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class FileReadWrite
{
 // This variable has to be set according to your system
 public static String path = "./its/TestData/";

  public FileReadWrite(String ReadFileName,String WriteFileName)
  {
    //Buffer for the text
    char[] buffer = new char[128];
    for (int i = 0; i < buffer.length; i++) {
      buffer[i] = '-';
    }

    // Create two File-variables
    File readfile  = new File(path+ReadFileName);
    File writefile = new File(path+WriteFileName);

//READING:
    if (readfile.exists())
    {
     try
     {
        // Create a reader.
        FileReader fr = new FileReader(readfile);

        // read the file and store 100 characters in the
        // buffer starting at  position 5 of the buffer.
        fr.read(buffer,5, 100);

        // close file
        fr.close();
     }
     catch (Exception ex)
     {
      System.out.println("Problem opening file "+readfile.getName());
     }
    }//if
    else
    {
      System.out.println("File not found "+readfile.getName());
    }
    System.out.println("Buffer>"+buffer+"<Buffer");

//WRITING:
     try
     {
      if (writefile.exists())
      {
        writefile.delete();
      }
      if (writefile.createNewFile())
        {
        // create a writer
        FileWriter fw = new FileWriter(writefile);

        // writes 40 charakters from the buffer
        // starting at position 7 of the buffer

        fw.write(buffer,7,40);

        // close file
        fw.close();

    }//if
    else
    {
      System.out.println("File not created "+writefile.getName());
    }
    }
     catch (Exception ex)
     {
      System.out.println("Problem opening file "+writefile.getName());
     }
  }

  public static void main(String[] args)
   {
    FileReadWrite RWF = new FileReadWrite("testtext1.txt","testtext2.txt");
   }
}