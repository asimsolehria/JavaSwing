package its.Light;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class LightListener implements ActionListener {

  private LightFrame parentFrame;
  public LightListener(LightFrame pf) {
    parentFrame = pf;
  }

  /** We check that the event was really "Clicking the
   *  Next-button" and then ask the frame to go the
   *  next color combination.
   */
  public void actionPerformed(ActionEvent evt) {
    String actComm = evt.getActionCommand();
    if(actComm.equals("Next")){
      parentFrame.showNextColors();
    }
    else
    {
     System.out.println("ILLEGAL COMMAND SOURCE");
    }
  }


  }