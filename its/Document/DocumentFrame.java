package its.Document;

/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
import its.SimpleFrame.SimpleFrame;
import java.io.FileReader;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import java.awt.BorderLayout;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.EditorKit;
import javax.swing.text.Position;

public class DocumentFrame extends SimpleFrame
{
  private JTextPane textPane;
  private DocumentStatusPanel statusBar;
  private DefaultStyledDocument styledDoc;
  private EditorKit ediKit;
  private Position p1,p2;

  private final String filename = "./its/TestData/DocTest.txt";



  public DocumentFrame()
  {
    textPane  = new JTextPane();
    statusBar = new DocumentStatusPanel();
    styledDoc = new DefaultStyledDocument();
    textPane.setDocument(styledDoc);
    ediKit = textPane.getEditorKit();
    JScrollPane sp = new JScrollPane(textPane);
    this.getContentPane().add(sp,BorderLayout.CENTER);
    this.getContentPane().add(statusBar,BorderLayout.SOUTH);
    this.setSize(500,500);
    readFile(filename);
    DocAtt.createAttributes();
    formatText();
    try
    {
       p1 = styledDoc.createPosition(228);
       p2 = styledDoc.createPosition(248);
    }
    catch (Exception ex)
    {
      System.out.println("Problem creating Positions.");
    }
   styledDoc.addDocumentListener(new DocListener(statusBar,p1,p2));
   statusBar.update("",p1.getOffset(),p2.getOffset());

  }

  private void readFile(String filename){
    try
    {
      ediKit.read(new FileReader(filename),styledDoc,0);
    }
    catch (Exception ex)
    {
      System.out.println("Problem reading file "+filename);
      ex.printStackTrace();
    }
  }


  // Formats some text ranges using attribute sets defined in class DocAtt
  private void formatText(){
       styledDoc.setCharacterAttributes( 73,10,DocAtt.underlinedText,false);
       styledDoc.setCharacterAttributes(85, 3,DocAtt.bigText,false);
       styledDoc.setCharacterAttributes(90, 4,DocAtt.boldText,false);
       styledDoc.setCharacterAttributes(98, 7,DocAtt.italicText,false);
       styledDoc.setCharacterAttributes(110, 7,DocAtt.greenText,false);
       styledDoc.setCharacterAttributes(131,13,DocAtt.superscriptText,false);
       styledDoc.setCharacterAttributes(147,11,DocAtt.subscriptText,false);
       styledDoc.setCharacterAttributes(171,14,DocAtt.whiteOnBlackText,false);
       styledDoc.setCharacterAttributes(190,18,DocAtt.ugly,true);
       styledDoc.setCharacterAttributes(228,20,DocAtt.redText,false);
}


  public static void main(String[] args)
  {
    DocumentFrame df = new DocumentFrame();
    df.showIt("Document-Frame");
  }


}