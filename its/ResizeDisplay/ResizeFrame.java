package its.ResizeDisplay;

import its.SimpleFrame.SimpleFrame;
/**
* Example program for Introduction to Swing
* @hor Paul Fischer, IMM, DTU
* @version 1.0
*/
public class ResizeFrame extends SimpleFrame{

  public ResizeFrame(){
    ResizePanel rp = new ResizePanel();
    this.setSize(500,300);

    this.getContentPane().add(rp);

  }

}
