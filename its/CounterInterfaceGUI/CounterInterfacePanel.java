package its.CounterInterfaceGUI;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
  public class CounterInterfacePanel extends JPanel
                                     implements ActionListener{

  private CounterModel counter;
  private JLabel valueLabel;

  public CounterInterfacePanel() {
     counter = new CounterModel();

     BorderLayout bordLay = new BorderLayout();
     this.setLayout(bordLay);

     JButton upButton   = new JButton("Up");
     JButton downButton = new JButton("Down");
     valueLabel = new JLabel(""+counter.getValue(),SwingConstants.CENTER);

     this.add(upButton,BorderLayout.WEST);
     this.add(downButton,BorderLayout.EAST);
     this.add(valueLabel,BorderLayout.CENTER);

     // A CounterInterfacePanel is now
     // also an ActionListener. Therefore, it
     // is asigend to the buttons using "this".
     upButton.addActionListener(this);
     downButton.addActionListener(this);
  }

  public void increment(){
    counter.increment();
    valueLabel.setText(""+counter.getValue());
  }

  public void decrement(){
    counter.decrement();
    valueLabel.setText(""+counter.getValue());
  }

  // Method actionPerformed is implemented
  // inside the class CounterPanel.
  public void actionPerformed(ActionEvent evt){ /*@\label{actPer:line}@*/
    String actionCommand = evt.getActionCommand();
    if(actionCommand.equals("Up")){
      increment();
    }
    else if(actionCommand.equals("Down")){
      decrement();
    }
    else{
      System.out.println("ERROR: Unexpected ActionCommand");
    }
  }// actionPerformed

}
