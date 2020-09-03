package its.InteractiveGraphic;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.SwingUtilities;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class MyMouseListener implements MouseListener
{
private StatusPanel statusPane;
private InteractivePanel interactivePane;

  public MyMouseListener(StatusPanel s,InteractivePanel i)
  {
    statusPane = s;
    interactivePane = i;
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
      if(SwingUtilities.isLeftMouseButton(e)) //left mouse button
      {
        interactivePane.addCircle(e.getX(),e.getY());
      }
      else // any other mouse button
      {
        interactivePane.removeNearestCircle(e.getX(),e.getY());
      }
     statusPane.setNoOfCircles(interactivePane.getNoOfCircles());
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