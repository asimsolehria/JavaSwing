package its.Trees;

import its.SimpleFrame.SimpleFrame;
import java.awt.*;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class TreeFrame extends SimpleFrame {

  public TreeFrame() {
    this.setSize(300,500);
    BiologyTree bioTree = new BiologyTree();
    this.getContentPane().add(bioTree,BorderLayout.CENTER);
  }

  public static void main(String[] args) {
      TreeFrame treeFrame = new TreeFrame();
      treeFrame.showIt("Tree Frame");
  }
}