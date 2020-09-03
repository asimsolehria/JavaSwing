package its.InteractiveGraphic;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class MyMousePositionsListener implements MouseMotionListener
{
  private StatusPanel SP;

  public MyMousePositionsListener(StatusPanel s)
  {
    SP = s;
  }

  public void mouseMoved(MouseEvent evt)
   {
   SP.setCoordinates(evt.getX(),evt.getY());
   }

  public void mouseDragged(MouseEvent evt)
   {
     // implemented with emtpy body
   }
}