package its.Menus;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.1
*/
public class MenuListener implements ActionListener {

  private MenuFrame menuFrame;

  public MenuListener(MenuFrame mf) {
    menuFrame = mf;
  }

  public void actionPerformed(ActionEvent evt) {
    String actionCommand = evt.getActionCommand();
    if(actionCommand.equals("Item 1")){
      menuFrame.setText("Item 1 selected");
    }
    else if(actionCommand.equals("Test")){
      menuFrame.setText("Item Test selected");
    }
    else if(actionCommand.equals("Exit")){
      System.exit(0);
    }
    else if(actionCommand.equals("Enable Test")){
      menuFrame.enableTest();
      menuFrame.setText("Item \"Test\" in Menu 1 enabled.");
    }
    else if(actionCommand.equals("Disable Test")){
      menuFrame.disableTest();
      menuFrame.setText("Item \"Test\" in Menu 1 disabled.");
    }
    else{
      System.out.println("ERROR: unknown action command.");
    }
    }
}