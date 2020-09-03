package its.Scrolling;

/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/

public class TextDisplayScrollDriver
{

 // This variable has to be set according to your system
 private static String path = "./its/TestData/";
 private static String fileName = "testtext3.txt";

  public static void main(String[] args)
  {
    TextDisplayScrollFrame TAF = new TextDisplayScrollFrame(path+fileName);
    TAF.showIt("Text with scrolling");
  }
}