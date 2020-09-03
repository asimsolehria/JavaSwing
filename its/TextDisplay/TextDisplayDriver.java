package its.TextDisplay;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class TextDisplayDriver
{
  // Adujust paths if necessary!!
  private static String path = "./its/TestData/";
  private static String fileName = "testtext1.txt";

  public static void main(String[] args)
  {
    TextDisplayFrame TAF = new TextDisplayFrame(path+fileName);
   TAF.showIt("Text Display");
  }
}