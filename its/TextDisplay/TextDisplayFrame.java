package its.TextDisplay;

import its.SimpleFrame.SimpleFrame;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JEditorPane;
import java.awt.BorderLayout;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class TextDisplayFrame extends SimpleFrame
{
  private JEditorPane textDisplayPane;

  public TextDisplayFrame(String filename)
  {
   textDisplayPane = new JEditorPane();
   this.getContentPane().add(textDisplayPane,BorderLayout.CENTER);
   this.setSize(200,160);

   File readfile  = new File(filename);

   try{
    FileReader fr = new FileReader(readfile);
    textDisplayPane.read(fr,null);
   }catch(IOException e){
    System.out.println("Problems opening or reading "+readfile.getPath());
   }

  }
}