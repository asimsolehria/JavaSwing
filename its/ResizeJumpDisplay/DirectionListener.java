package its.ResizeJumpDisplay;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class DirectionListener implements ActionListener{

  private PositionModel posModel;
  private ResizeJumpFrame parentFrame;

  public DirectionListener(PositionModel pm,ResizeJumpFrame rjf) {
    posModel = pm;
    parentFrame = rjf;
  }
  public void actionPerformed(ActionEvent evt) {
    String actionComm = evt.getActionCommand();
    if(actionComm.equals("Up")){
      posModel.moveUP();
    }
    else if(actionComm.equals("Down")){
      posModel.moveDown();
    }
    else if(actionComm.equals("Left")){
      posModel.moveLeft();
    }
    else if(actionComm.equals("Right")){
      posModel.moveRight();
    }

    parentFrame.repaint();
   }
}