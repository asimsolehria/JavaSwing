package its.Layouts;

import java.awt.FlowLayout;
import java.awt.GridLayout;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class LayoutDriver
{
  public static void main(String[] args)
  {
    FlowLayout  flowLayout1 = new FlowLayout();
    LayoutFrame flow1Frame  = new LayoutFrame(flowLayout1);
    flow1Frame.showIt("Flow Layout 1",60,60);

    FlowLayout  flowLayout2 = new FlowLayout(FlowLayout.LEFT,40,30);
    LayoutFrame flow2Frame  = new LayoutFrame(flowLayout2);
    flow2Frame.showIt("Flow Layout 2",300,60);

    GridLayout  gridLayout  = new GridLayout(2,4);
    LayoutFrame gridFrame  = new LayoutFrame(gridLayout);
    gridFrame.showIt("Grid Layout",540,60);
  }
}