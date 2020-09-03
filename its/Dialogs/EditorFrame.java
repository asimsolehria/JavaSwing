package its.Dialogs;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
import its.SimpleFrame.SimpleFrame;
import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.util.StringTokenizer;

public class EditorFrame extends EditorSkeletonFrame {

  private JEditorPane textDisplayPane;
  private JFileChooser chooser;
  private File selectedFile;
  private DataTransferObject dataTransfer;
  private SearchDialog searchDialog;

  private String startPath = "./its/TestData";

  public EditorFrame()
  {
   textDisplayPane = new JEditorPane();
   JScrollPane scrollPane = new JScrollPane(textDisplayPane);
   this.getContentPane().add(scrollPane,BorderLayout.CENTER);

   // Create menu bar, menus and menu items
   JMenuBar menubar = new JMenuBar();
   this.setJMenuBar(menubar);

   JMenu fileMenu = new JMenu("File");
   JMenu toolMenu = new JMenu("Tools");
   menubar.add(fileMenu);
   menubar.add(toolMenu);


   JMenuItem loadItem    = new JMenuItem("Load");
   JMenuItem saveItem    = new JMenuItem("Save");
   JMenuItem exitItem    = new JMenuItem("Exit");
   JMenuItem searchItem  = new JMenuItem("Search");

   fileMenu.add(loadItem);
   fileMenu.add(saveItem);
   fileMenu.addSeparator();
   fileMenu.add(exitItem);
   toolMenu.add(searchItem);

   // Create a listener and add it to the menu items

   EditorListener editorListener = new EditorListener(this);
   loadItem.addActionListener(editorListener);
   saveItem.addActionListener(editorListener);
   exitItem.addActionListener(editorListener);
   searchItem.addActionListener(editorListener);
 }


 public void openFile(){
   if(chooser == null){
      chooser = new JFileChooser(startPath);
   }
   int returnVal = chooser.showOpenDialog(this);
   if(returnVal == JFileChooser.APPROVE_OPTION)
   {
     selectedFile =  chooser.getSelectedFile();
     try{
       FileReader reader = new FileReader(selectedFile);
       textDisplayPane.read(reader,null);
       reader.close();
     }catch(IOException e){
     System.out.println("Problems opening or reading "+selectedFile.getName());
     }
    }//if
 }

 public void saveFile(){
    try{
      FileWriter fw = new FileWriter(selectedFile);
      fw.write(textDisplayPane.getText());
      fw.close();
      }catch(IOException e){
       System.out.println("Problems writing "+selectedFile.getName());
      }
      textDisplayPane.setText("");
 }

 public void search(){
  if (searchDialog == null)
  {
    searchDialog  = new SearchDialog(this);
    dataTransfer  = new DataTransferObject();
  }
  searchDialog.showIt(dataTransfer);
  if(dataTransfer.getSearch() &&
         (dataTransfer.getSerchWord().length() > 0))
   {
    countWord(dataTransfer.getSerchWord(),
               dataTransfer.getCaseSensitive());
   }
 }

 public void countWord(String word, boolean caseSensitive)
 {
  String Text = textDisplayPane.getText();
  int count = 0;
  StringTokenizer stok = new StringTokenizer(Text," \n\t,.;");
  while (stok.hasMoreTokens())
  {
    if(caseSensitive)
     {
       if(stok.nextToken().equals(word))
       {
          count++;
       }
     }
    else
     {
       if(stok.nextToken().equalsIgnoreCase(word))
       {
         count++;
       }
     }
  }
 String result =  "Word \""+word+"\" appears "+count+"-times.";
 JOptionPane.showMessageDialog(this,
 result,"Search result",
 JOptionPane.INFORMATION_MESSAGE);

  }

 public void exitEditor(){
   System.exit(0);
 }
}
