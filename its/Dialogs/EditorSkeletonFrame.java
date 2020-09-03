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

public class EditorSkeletonFrame extends SimpleFrame {

  private JEditorPane textDisplayPane;

  public EditorSkeletonFrame()
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
 // The next four methods do not yet do anything
 // useful. The real code is supplied later.
 public void openFile(){
   //Code for loading a file has to go here.
   System.out.println("Menu item Load selected.");
 }

 public void saveFile(){
   //Code for saving a file has to go here.
   System.out.println("Menu item Save selected.");
 }

 public void search(){
   //Code for searching has to go here.
   System.out.println("Menu item Search selected.");
 }

 public void exitEditor(){
   //Code for leaving the editor has to go here.
   System.out.println("Menu item Exit selected.");
 }
}