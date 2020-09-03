package its.HTML;

import java.awt.*;
import its.SimpleFrame.SimpleFrame;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import javax.swing.*;
import java.net.URL;



/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/

public class HTMLViewer extends SimpleFrame
{
  private JEditorPane ediPane;
  private static String htmlSource = "/its/TestData/test1.html";
  private static String workingDir;

  public HTMLViewer(String URLname)
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
         LinkLis lili = new LinkLis();
         ediPane.addHyperlinkListener(lili);
         this.getContentPane().add(ediPane);
       }
  public static void main(String[] args)
  {
    HTMLViewer hf = new HTMLViewer(htmlSource);
    hf.showIt("HTML-Viewer");
  }

  private class LinkLis implements HyperlinkListener
  {
    public void hyperlinkUpdate(HyperlinkEvent hylevt)
    {
      try
      {
       if (hylevt.getEventType() == HyperlinkEvent.EventType.ACTIVATED)
        {
         URL newPage = hylevt.getURL();
         ediPane.setPage(newPage);
        }
      }
      catch (Exception ex)
      {
        System.out.println("Problems with hyperlink-listener");
      }
    }// method
 }// internal class
}