package its.CounterGUI;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class CounterPanel extends JPanel {

  private CounterModel counter;
  private JLabel valueLabel;

  public CounterPanel() {
     counter = new CounterModel();

     BorderLayout bordLay = new BorderLayout();
     this.setLayout(bordLay);

     JButton upButton   = new JButton("Up");
     JButton downButton = new JButton("Down");
     valueLabel = new JLabel(""+counter.getValue(),SwingConstants.CENTER);

     this.add(upButton,BorderLayout.WEST);
     this.add(downButton,BorderLayout.EAST);
     this.add(valueLabel,BorderLayout.CENTER);

     // The next three lines will later be used to incorporate the listener.
     // CounterListener countList = new CounterListener(this); /*@\label{liststart:line}@*/
     // upButton.addActionListener(countList);
     // downButton.addActionListener(countList); /*@\label{listend:line}@*/
  }

  public void increment(){
    counter.increment();
    valueLabel.setText(""+counter.getValue());
  }

  public void decrement(){
    counter.decrement();
    valueLabel.setText(""+counter.getValue());
  }
}
