package its.InteractiveGraphic;

import java.awt.Graphics;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class Circle
{

  private double x,y,radius;

  public Circle(double xx, double yy, double rad)
  {
   x      = xx;
   y      = yy;
   radius = rad;
  }

  // Draws the circle
  public void draw(Graphics g)
  {
    g.fillOval((int)Math.round(x-radius),(int)Math.round(y-radius),
               (int)Math.round(2.0*radius),(int)Math.round(2.0*radius));
  }

  // Computes the distance between this circles
  // center and the point (x1,y1).
  public double distanceTo(double x1, double y1)
  {
    return(Math.sqrt(Math.pow(x-x1,2)+Math.pow(y-y1,2) ));
  }
}