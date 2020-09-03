package its.CounterGUI;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CounterListener implements ActionListener{

  private CounterPanel countPane;

  public CounterListener(CounterPanel counp) {
    countPane = counp;
  }

// This method is called by the runntime system.
// The programmer has to add the code to be executed
// as a response to the event.
  public void actionPerformed(ActionEvent evt){
   // Beginning of own code
    String actionCommand = evt.getActionCommand();
    if(actionCommand.equals("Up")){
      countPane.increment();
    }
    else if(actionCommand.equals("Down")){
      countPane.decrement();
    }
    else{
      System.out.println("ERROR: Unexpected ActionCommand");
    }
   // End of own code
  }
}
