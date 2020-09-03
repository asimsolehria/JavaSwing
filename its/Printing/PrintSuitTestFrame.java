package its.Printing;

import its.SimpleFrame.SimpleFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class PrintSuitTestFrame extends SimpleFrame
                                implements ActionListener
 {
  public PrintSuitTestFrame() {
   JButton button = new JButton("Print");
   button.addActionListener(this);
   this.getContentPane().add(button,BorderLayout.SOUTH);
   JTextArea textPane = new JTextArea();
   textPane.setText("Test test\n test test\n test test\n test test");
   this.getContentPane().add(textPane,BorderLayout.CENTER);
  }

  public void actionPerformed(ActionEvent evt){
    PrintSuit.printComponent(this);
  }

  static public void main(String[] args) {
    PrintSuitTestFrame pstf = new PrintSuitTestFrame();
    pstf.showIt();
  }
}