package its.HTML;

import its.SimpleFrame.SimpleFrame;
import javax.swing.JEditorPane;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class SimpleHTMLFrame extends SimpleFrame
{
  private JEditorPane ediPane;
  private static String htmlSource = "/its/TestData/test1.html";
  private static String workingDir;

  public SimpleHTMLFrame(String URLname)
  {
       this.setSize(400,400);
       workingDir = System.getProperty("user.dir");
       // in the following we assume, that the program
       // is run from the parent directory of its.
       // Use an absolute path if necessary:
       try{
            ediPane = new JEditorPane("file:///"+workingDir+htmlSource);
         // ediPane = new JEditorPane("file:///C:/absolute/path//its/TestData/test1.html");
            ediPane.setEditable(false);
          } catch(Exception e){}
       // Later, the code for the link listener will be added here.
         this.getContentPane().add(ediPane);
       }

       public static void main(String[] args){
            SimpleHTMLFrame shf = new SimpleHTMLFrame(htmlSource);
            shf.showIt("Simple HTML-Display");
          }
  // Later, the link listener class will be defined here.
}