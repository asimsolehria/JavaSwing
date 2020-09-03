package its.CounterAnonymousGUI;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class CounterAnonymousPanel extends JPanel{

  private CounterModel counter;
  private JLabel valueLabel;

  public CounterAnonymousPanel() {
     counter = new CounterModel();

     BorderLayout bordLay = new BorderLayout();
     this.setLayout(bordLay);

     JButton upButton   = new JButton("Up");
     JButton downButton = new JButton("Down");
     valueLabel = new JLabel(""+counter.getValue(),SwingConstants.CENTER);

     this.add(upButton,BorderLayout.WEST);
     this.add(downButton,BorderLayout.EAST);
     this.add(valueLabel,BorderLayout.CENTER);

     // The listener for the up-button is defined
     // anonymous and on the fly.
     upButton.addActionListener(new ActionListener(){
       public void actionPerformed(ActionEvent evt){
                increment();
       }// actionPerformed
      }//ActionListener
     );//addActionListener

     // The listener for the down-button is defined
     // anonymous and on the fly.
     downButton.addActionListener(new ActionListener(){
       public void actionPerformed(ActionEvent evt){
                decrement();
       }// actionPerformed
      }//ActionListener
     );//addActionListener
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