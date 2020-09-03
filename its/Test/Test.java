package its.Test;

import its.SimpleFrame.SimpleFrame;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

public class Test extends SimpleFrame {

  public Test() {
   JLabel label = new JLabel("It works!",JLabel.CENTER);
   label.setForeground(Color.red);
   label.setOpaque(true);
   label.setBackground(Color.white);
   label.setFont(new Font("SansSerif",Font.BOLD,24));
   this.getContentPane().add(label);
  }
  public static void main(String[] args) {
    Test test = new Test();
    test.showIt("Test of its-package");
  }
}
