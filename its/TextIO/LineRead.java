package its.TextIO;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
import java.io.*;

public class LineRead
{
 // This variable has to be set according to your system
 public static String path = "./its/TestData/";
  public LineRead(String ReadFileName)
  {
    File readfile = new File(path+ReadFileName);
    String line;
    try
    {
      BufferedReader bfr = new BufferedReader(new FileReader(readfile));
      while((line = bfr.readLine()) != null)
      {
        System.out.println("READ>"+line+"<");
      }
    }
    catch (Exception ex)
    {
      System.out.println("Problem opening file "+readfile.getName());
    }
  }

   public static void main(String[] args)
   {
    LineRead LR =  new LineRead("testtext1.txt");
   }
}