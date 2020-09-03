package its.Dialogs;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class EditorListener implements ActionListener {

  private EditorSkeletonFrame editor;

  public EditorListener(EditorSkeletonFrame edi) {
   editor = edi;
 }

 public void actionPerformed(ActionEvent evt) {
   String actionCommand = evt.getActionCommand();
   if(actionCommand.equals("Load")){
     editor.openFile();
   }
   else if(actionCommand.equals("Save")){
     editor.saveFile();
   }
   else if(actionCommand.equals("Exit")){
     editor.exitEditor();
   }
   else if(actionCommand.equals("Search")){
     editor.search();
   }
   else {
    System.out.println("Error: Unexpected action command.");
   }
 }
}
