package its.Layouts;

import java.awt.LayoutManager;
import its.SimpleFrameWithPanels.ColorPanel;
import java.awt.Color;
import its.SimpleFrame.*;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class LayoutFrame extends SimpleFrame
{
  public LayoutFrame(LayoutManager layout)
  {
    this.getContentPane().setLayout(layout);

    ColorPanel CP1 = new ColorPanel(Color.red,30,30);
    ColorPanel CP2 = new ColorPanel(Color.yellow,40,20);
    ColorPanel CP3 = new ColorPanel(Color.green);
    ColorPanel CP4 = new ColorPanel(Color.blue);
    ColorPanel CP5 = new ColorPanel(Color.white,80,20);
    this.getContentPane().add(CP1);
    this.getContentPane().add(CP2);
    this.getContentPane().add(CP3);
    this.getContentPane().add(CP4);
    this.getContentPane().add(CP5);
  }
}
