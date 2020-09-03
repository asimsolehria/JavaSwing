package its.SimpleFrameWithPanels;

import java.awt.*;
import javax.swing.JPanel;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class ColorPanel extends JPanel
{
  // Generate a JPanel with background color col .
  public ColorPanel(Color col)
  {
    this.setBackground(col);
  }

  // Generate a JPanel with background color col,
  //  width width, and height height .
  public ColorPanel(Color col,int width,int height)
  {
    this.setPreferredSize(new Dimension(width,height));
    this.setBackground(col);
  }

}