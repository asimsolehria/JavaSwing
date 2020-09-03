package its.InteractiveGraphic;

import java.awt.Graphics;
import java.util.Vector;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class CircleAdministration
{
  private Vector circles;

  public CircleAdministration()
  {
   circles = new Vector();
  }

  public void addCircle(Circle circ)
   {
      circles.add(circ);
   }

  public void removeNearestCircle(int x1, int y1)
  {
    Circle circ;
    double minDist = Double.MAX_VALUE;
    int    minDistIndex = -1;
    for (int i=0 ; i < circles.size() ; i++)
    {
      circ = (Circle)(circles.get(i));
      if(circ.distanceTo(x1,y1) < minDist)
      {
       minDist = circ.distanceTo(x1,y1);
       minDistIndex = i;
      }// if
    }//for i
    if ((minDistIndex >= 0) && (minDist < 30))
     {
       circles.removeElementAt(minDistIndex);
     }//if
  }//method

  public void drawAll(Graphics g)
  {
    Circle currentCircle;
    for (int i=0 ; i < circles.size() ; i++)
    {
       currentCircle = (Circle)(circles.get(i));
       currentCircle.draw(g);
    }//for i
   }//method

  public int getNoOfCircles(){
    return(circles.size());
  }//method
}