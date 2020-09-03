package its.MouseEvents;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class MyMouseListener implements MouseListener
{
private StatusPanel statusPane;

  public MyMouseListener(StatusPanel s)
  {
    statusPane = s;
  }

  public void mouseEntered(MouseEvent e)
   {
     statusPane.setInOut("yes");
   }

  public void mouseExited(MouseEvent e)
   {
      statusPane.setInOut("no");
      statusPane.setCoordinates(-1,-1);
   }

  public void mouseClicked(MouseEvent e)
   {
      statusPane.incrementClickCount();
   }

  public void mousePressed(MouseEvent e)
   {
     //implementd with empty body
   }

  public void mouseReleased(MouseEvent e)
   {
     //implementd with empty body
   }

}