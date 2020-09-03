package its.CounterInternalGUI;

import javax.swing.JFrame;
import its.SimpleFrame.SimpleFrame;
import java.awt.BorderLayout;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class CounterFrame extends SimpleFrame {

  public CounterFrame() {
    CounterInternalPanel counterPane = new CounterInternalPanel();
    this.getContentPane().add(counterPane,BorderLayout.CENTER);
  }
}
