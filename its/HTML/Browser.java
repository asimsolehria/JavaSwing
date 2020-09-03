package its.HTML;

import its.SimpleFrame.SimpleFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Stack;
import javax.swing.*;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.1
*/
public class Browser extends SimpleFrame
{
  private JEditorPane ediPane;
  private static String startURL = "http://www.imm.dtu.dk/swingbook/HTMLTest/test1.html";
  private ToolPanel tools;
  private Stack urlStack;

  public Browser(String URLname)
  {
         this.setSize(600,600);
         urlStack = new Stack();
         ediPane = new JEditorPane();
         ediPane.setEditable(false);
         ediPane.setMinimumSize(new Dimension(600,600));

         LinkLis lili = new LinkLis();
         tools = new ToolPanel(URLname);
         ediPane.addHyperlinkListener(lili);
         this.getContentPane().add(tools,BorderLayout.NORTH);
         this.getContentPane().add(new JScrollPane(ediPane),BorderLayout.CENTER);
       }
  public static void main(String[] args)
  {
    Browser brow = new Browser(startURL);
    brow.showIt("ITS-Browser");
  }

  private class LinkLis implements HyperlinkListener
  {
    public void hyperlinkUpdate(HyperlinkEvent hyevt)
    {
      try
      {
        if (hyevt.getEventType() == HyperlinkEvent.EventType.ACTIVATED)
        {
         URL t = ediPane.getPage();
         urlStack.push(t);
         ediPane.setPage(hyevt.getURL());
        }
      }
      catch (Exception ex)
      {
        System.out.println("Problems with hyperlink listener");
      }
    }// method
 }// internal class

 private class ToolPanel extends JPanel{
  private JTextField urlField;
  private JButton backButton, goButton;

  public ToolPanel(String URLname){
    this.setLayout(new FlowLayout());
    urlField    = new JTextField();
    urlField.setText(URLname);
    backButton  = new JButton("Back");
    goButton    = new JButton("GO!");
    JLabel ulab = new JLabel("   URL:");
    urlField.setPreferredSize(new Dimension(300,30));
    this.add(backButton);
    this.add(ulab);
    this.add(urlField);
    this.add(goButton);
    ButtonListener buli = new ButtonListener();
    backButton.addActionListener(buli);
    goButton.addActionListener(buli);
  }//constructor

  public String getURL(){
    return(urlField.getText().trim());
  }
 }// internal class

 private class ButtonListener implements ActionListener{
   public void actionPerformed(ActionEvent actevt){
     String command = actevt.getActionCommand();
     if (command.equals("Back"))
     {
       if(urlStack.size() > 0)
       {
        URL url = (URL)urlStack.pop();
        try
        {
         ediPane.setPage(url);
        }
        catch (Exception ex)
        {
          System.out.println("Problem in Back: URL not found.");
        }
       }
     }
     else  if (command.equals("GO!"))
     {
       try
       {
          URL url = new URL(tools.getURL());
          urlStack.removeAllElements();
          ediPane.setPage(url);
       }
       catch (Exception ex)
       {
         System.out.println("Problem in GO!: URL not found.");
       }
     }//ifelse
  }//method
 }// internal class
}