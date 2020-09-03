package its.MouseEvents;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class StatusPanel extends JPanel
{
  private JLabel posText   = new JLabel("position:");
  private JLabel XCoord    = new JLabel("0", JLabel.RIGHT);
  private JLabel YCoord    = new JLabel("0", JLabel.RIGHT);
  private JLabel countText = new JLabel("no. of clicks");
  private JLabel counts    = new JLabel("0", JLabel.RIGHT);
  private JLabel dummy1    = new JLabel();
  private JLabel inOutText = new JLabel("mouse is in comp.");
  private JLabel inOut     = new JLabel("no", JLabel.RIGHT);
  private JLabel dummy2    = new JLabel();
  private int clickCount = 0;

   public StatusPanel()
   {
    this.setLayout(new GridLayout(3,3));
    this.add(posText);
    this.add(XCoord);
    this.add(YCoord);
    this.add(countText);
    this.add(counts);
    this.add(dummy1);
    this.add(inOutText);
    this.add(inOut);
    this.add(dummy2);
   }
// Updates the displayed coordinates of the mouse position.
   public void setCoordinates(int x, int y)
   {
    XCoord.setText(Integer.toString(x));
    YCoord.setText(Integer.toString(y));
   }
// Sets the innformation whether the mouse is in or out.
   public void setInOut(String str)
   {
    inOut.setText(str);
   }
// Increments the click count and displays it.
   public void incrementClickCount(){
     clickCount++;
     counts.setText(Integer.toString(clickCount));
   }
}
