package its.MouseEvents;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class MyMousePositionsListener implements MouseMotionListener
{
  private StatusPanel statusPane;

  public MyMousePositionsListener(StatusPanel s)
  {
    statusPane = s;
  }

  public void mouseMoved(MouseEvent evt)
   {
   statusPane.setCoordinates(evt.getX(),evt.getY());
   }

  public void mouseDragged(MouseEvent evt)
   {
     // implemented with emtpy body
   }
}