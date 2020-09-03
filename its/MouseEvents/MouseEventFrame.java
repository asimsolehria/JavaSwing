package its.MouseEvents;

import its.SimpleFrame.SimpleFrame;
import java.awt.BorderLayout;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class MouseEventFrame extends SimpleFrame
{
  MouseEventPanel mePanel = new MouseEventPanel();
  StatusPanel     stPanel = new StatusPanel();

  public MouseEventFrame()
  {
    this.setTitle("Mouse application");
    this.getContentPane().add(mePanel,BorderLayout.CENTER);
    this.getContentPane().add(stPanel,BorderLayout.SOUTH);
    pack();

    MyMousePositionsListener mPosAdpt = new MyMousePositionsListener(stPanel);
    mePanel.addMouseMotionListener(mPosAdpt);

    MyMouseListener MAdpt = new MyMouseListener(stPanel);
    mePanel.addMouseListener(MAdpt);

  }
}
