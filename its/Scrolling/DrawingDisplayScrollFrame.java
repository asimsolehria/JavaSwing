package its.Scrolling;

import its.SimpleFrame.SimpleFrame;
import javax.swing.JScrollPane;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class DrawingDisplayScrollFrame extends SimpleFrame {

  public DrawingDisplayScrollFrame() {
    DrawingDisplayScrollPanel drawPane = new DrawingDisplayScrollPanel();
    JScrollPane scrollPane = new JScrollPane(drawPane);
    this.getContentPane().add(scrollPane);
    this.setSize(340,250);
   }
}