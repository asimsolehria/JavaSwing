package its.Borders;

import java.awt.*;
import its.SimpleFrame.SimpleFrame;

/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/

public class BorderFrame extends SimpleFrame
{

  public BorderFrame()
  {
    this.getContentPane().setLayout(new GridLayout(2,2));
    BorderPanel borderPanel1 = new BorderPanel();
    BorderPanel borderPanel2 = new BorderPanel();
    BorderPanel borderPanel3 = new BorderPanel("Panel 3");
    BorderPanel borderPanel4 = new BorderPanel("Panel 4");
    this.getContentPane().add(borderPanel1);
    this.getContentPane().add(borderPanel2);
    this.getContentPane().add(borderPanel3);
    this.getContentPane().add(borderPanel4);
  }

  public static void main(String[] args){
    BorderFrame borderFrame = new BorderFrame();
    borderFrame.showIt("Borders");

  }
}