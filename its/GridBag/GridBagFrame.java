package its.GridBag;

import its.Borders.BorderPanel;
import its.SimpleFrame.SimpleFrame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JComponent;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class GridBagFrame extends SimpleFrame
{
  private GridBagLayout gbl = new GridBagLayout();
  public GridBagFrame()
  {
    this.getContentPane().setLayout(gbl);
    BorderPanel panelA = new BorderPanel("Panel A");
    BorderPanel panelB = new BorderPanel("Panel B");
    BorderPanel panelC = new BorderPanel("Panel C");
    BorderPanel panelD = new BorderPanel("Panel D");
    BorderPanel panelE = new BorderPanel("Panel E");
    BorderPanel panelF = new BorderPanel("Panel F");

    this.getContentPane().add(panelA);
    this.getContentPane().add(panelB);
    this.getContentPane().add(panelC);
    this.getContentPane().add(panelD);
    this.getContentPane().add(panelE);
    this.getContentPane().add(panelF);

    easyConstraints(gbl,panelA,1,2,0,0,2.0,1.0);
    easyConstraints(gbl,panelB,2,1,1,0,1.0,2.0);
    easyConstraints(gbl,panelC,1,1,0,2,1.0,1.0);
    easyConstraints(gbl,panelD,1,2,1,1,1.0,1.0);
    easyConstraints(gbl,panelE,1,1,2,1,1.0,1.0);
    easyConstraints(gbl,panelF,1,1,2,2,1.0,1.0);
 }

  private void easyConstraints(GridBagLayout GLB,JComponent Comp,
              int w, int h, int x, int y,double wx, double wy){
    GridBagConstraints constraints = new  GridBagConstraints();
    constraints.fill = GridBagConstraints.BOTH;
    constraints.gridwidth =  w;
    constraints.gridheight = h;
    constraints.gridx = x;
    constraints.gridy = y;
    constraints.weightx = wx;
    constraints.weighty = wy;
    gbl.setConstraints(Comp,constraints);
  }

  public static void main(String[] args){
    GridBagFrame gridbagFrame = new GridBagFrame();
    gridbagFrame.showIt("Grid-Bag Layout");

  }
}