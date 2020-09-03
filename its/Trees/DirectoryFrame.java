package its.Trees;

import its.SimpleFrame.SimpleFrame;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class DirectoryFrame extends SimpleFrame {

  public DirectoryFrame() {
    this.setSize(300,500);
    DirectoryTree dirTree = new DirectoryTree();
    JScrollPane scrollpane = new JScrollPane(dirTree);
    this.getContentPane().add(scrollpane,BorderLayout.CENTER);
  }

  public static void main(String[] args) {
     DirectoryFrame dirTreeFrame = new DirectoryFrame();
     dirTreeFrame.showIt("Directory Tree Frame");
    }

}