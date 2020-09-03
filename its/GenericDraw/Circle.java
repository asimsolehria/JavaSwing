package its.GenericDraw;

import java.awt.Graphics;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class Circle extends GraphicalObject {

  private RealPoint center;
  private double radius;

  public Circle(RealPoint ce, double rad) {
    center = ce;
    anchor = ce;
    radius = rad;
    dimObj = new DimensionObject(center.getX()-radius,
      center.getX()+radius,center.getY()-radius,center.getY()+radius);

  }


  public void draw(Graphics g, ScaleObject scale) {
    PixelPoint centerPix = Conversions.realToPixelPoint(center,scale);
    int radX = Conversions.realLengthXtoPixels(radius,scale);
    int radY = Conversions.realLengthYtoPixels(radius,scale);

    g.setColor(this.color);
    g.drawOval(centerPix.getX() - radX,
               centerPix.getY() - radY,
               2*radX,
               2*radY);
  }

  public String textString(){
    return("Circle: "+center.toString()+";"+radius);
  }
}