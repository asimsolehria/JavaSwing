package its.SimpleGraphics;

import its.SimpleFrame.SimpleFrame;
import java.awt.BorderLayout;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class SimpleGraphicsFrame extends SimpleFrame
{

  public SimpleGraphicsFrame()
  {
    this.setTitle("Simple Graphics");

    SimpleGraphicsPanel SGP = new SimpleGraphicsPanel();
    this.getContentPane().add(SGP,BorderLayout.CENTER);

    pack();
  }
}
