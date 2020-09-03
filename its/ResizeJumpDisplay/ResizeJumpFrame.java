package its.ResizeJumpDisplay;

import its.SimpleFrame.SimpleFrame;
import java.awt.BorderLayout;
/**
* Example program for Introduction to Swing
* @hor Paul Fischer, IMM, DTU
* @version 1.0
*/
public class ResizeJumpFrame extends SimpleFrame{

  public ResizeJumpFrame(){
    PositionModel posModel = new PositionModel(3,5);
    ResizeJumpPanel resizePanel = new ResizeJumpPanel(posModel);
    this.setSize(500,300);

    this.getContentPane().add(resizePanel,BorderLayout.CENTER);

    DirectionPanel dirPanel = new DirectionPanel(posModel,this);
    this.getContentPane().add(dirPanel,BorderLayout.SOUTH);
  }

}
