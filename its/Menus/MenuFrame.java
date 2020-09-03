package its.Menus;

import its.SimpleFrame.SimpleFrame;
import javax.swing.*;
import java.awt.BorderLayout;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class MenuFrame extends SimpleFrame {

  private JLabel display;
  private JMenuItem testItem;

  public MenuFrame() {
    display = new JLabel("No menu selected.",JLabel.CENTER);

    // Create a menu bar and add it to the frame

    JMenuBar menubar = new JMenuBar();
    this.setJMenuBar(menubar);

    // Create and add the menus
    JMenu firstMenu  = new JMenu("Menu 1");
    JMenu secondMenu = new JMenu("Menu 2");
    menubar.add(firstMenu);
    menubar.add(secondMenu);

    // Create the menu items and add them to the menues
    JMenuItem firstItem   = new JMenuItem("Item 1");
              testItem    = new JMenuItem("Test");
    JMenuItem exitItem    = new JMenuItem("Exit");
    JMenuItem enableItem  = new JMenuItem("Enable Test");
    JMenuItem disableItem = new JMenuItem("Disable Test");

    firstMenu.add(firstItem );
    firstMenu.add(testItem);
    firstMenu.addSeparator();
    firstMenu.add(exitItem);

    secondMenu.add(enableItem);
    secondMenu.add(disableItem);

    // Create a listener and add it to the menu items
    MenuListener menuList = new MenuListener(this);
    firstItem.addActionListener(menuList);
    testItem.addActionListener(menuList);
    exitItem.addActionListener(menuList);
    enableItem.addActionListener(menuList);
    disableItem.addActionListener(menuList);

    // Add the label to the frame
    this.getContentPane().add(display,BorderLayout.CENTER);
  }

  // Method to set the text in the label
   public void setText(String text){
     display.setText(text);
   }

  // Method to enable the label
   public void enableTest(){
      testItem.setEnabled(true);
   }

  // Method to disable the label
   public void disableTest(){
      testItem.setEnabled(false);
   }
}