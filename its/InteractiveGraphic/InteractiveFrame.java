package its.InteractiveGraphic;

import its.SimpleFrame.SimpleFrame;
import java.awt.BorderLayout;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class InteractiveFrame extends SimpleFrame
{
  InteractivePanel IAPanel = new InteractivePanel();
  StatusPanel      StPanel = new StatusPanel();

  public InteractiveFrame()
  {
    this.setTitle("Interaktiv Graphic");
    this.getContentPane().add(IAPanel,BorderLayout.CENTER);
    this.getContentPane().add(StPanel,BorderLayout.SOUTH);
    pack();

    MyMousePositionsListener MPosAdpt = new MyMousePositionsListener(StPanel);
    IAPanel.addMouseMotionListener(MPosAdpt);

    MyMouseListener MAdpt = new MyMouseListener(StPanel,IAPanel);
    IAPanel.addMouseListener(MAdpt);
  }
}