package its.GenericDraw;

import java.awt.Graphics;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class OpenPolygon extends GraphicalObject {

  private RealPoint[] points;

  public OpenPolygon(RealPoint[] pts) {
    points = pts;
    if(points.length < 2){
      System.out.println("ERROR in OpenPolygon: less than two points.");
    }
    else
    {
      double xmin = points[0].getX();
      double xmax = points[0].getX();
      double ymin = points[0].getY();
      double ymax = points[0].getY();
      for (int i = 1; i < points.length; i++) {
        xmin = Math.min(xmin,points[i].getX());
        xmax = Math.max(xmax,points[i].getX());
        ymin = Math.min(ymin,points[i].getY());
        ymax = Math.max(ymax,points[i].getY());
      }
      dimObj = new DimensionObject(xmin,xmax,ymin,ymax);
      anchor = points[0];
    }
  }

  public void draw(Graphics g, ScaleObject scale) {
    PixelPoint startPix = Conversions.realToPixelPoint(points[0],scale);
    g.setColor(color);
    for (int i = 0; i < points.length; i++) {
     PixelPoint endPix   = Conversions.realToPixelPoint(points[i],scale);
     g.drawLine(startPix.getX(),startPix.getY(),endPix.getX(),endPix.getY());
     startPix = endPix;
    }
 }

 public String textString(){
   String result = "Open Polygon: "+points[0].toString();
   for (int i = 1; i < points.length; i++) {
    result += ";"+points[i].toString();
   }
  return(result);
 }
}