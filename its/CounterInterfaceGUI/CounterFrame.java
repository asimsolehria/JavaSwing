package its.CounterInterfaceGUI;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import its.SimpleFrame.SimpleFrame;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class CounterFrame extends SimpleFrame {

  public CounterFrame() {
    CounterInterfacePanel counterPane = new CounterInterfacePanel();
    this.getContentPane().add(counterPane,BorderLayout.CENTER);
  }
}