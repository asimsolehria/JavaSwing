package its.Scrolling;

import its.SimpleFrame.SimpleFrame;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.awt.BorderLayout;
import javax.swing.JEditorPane;
import javax.swing.JScrollPane;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class TextDisplayScrollFrame extends SimpleFrame
{
  private JEditorPane TextDisplayPanel;

  public TextDisplayScrollFrame(String filename)
  {

   TextDisplayPanel = new JEditorPane();

   JScrollPane scrollPane  = new JScrollPane(TextDisplayPanel);
   this.getContentPane().add(scrollPane,BorderLayout.CENTER);

   File readfile  = new File(filename);

   try{
    FileReader fr = new FileReader(readfile);
    TextDisplayPanel.read(fr,null);
   }catch(IOException e){
    System.out.println("Problems openeing or reading "+readfile.getName());
   }
 }
}