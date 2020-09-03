package its.GenericDraw;

import java.awt.Graphics;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class Line extends GraphicalObject {

  private RealPoint startPt, endPt;
  private PixelPoint startPtPix, endPtPix;

  public Line(RealPoint s, RealPoint e) {
     startPt = s;
     endPt   = e;
     dimObj = new DimensionObject(
                 Math.min(startPt.getX(),endPt.getX()),
                 Math.max(startPt.getX(),endPt.getX()),
                 Math.min(startPt.getY(),endPt.getY()),
                 Math.max(startPt.getY(),endPt.getY()));
     anchor = startPt;
  }

  public void draw(Graphics g, ScaleObject scale) {
    startPtPix = Conversions.realToPixelPoint(startPt,scale);
    endPtPix   = Conversions.realToPixelPoint(endPt,scale);
    g.setColor(color);
    g.drawLine(startPtPix.getX(),startPtPix.getY(),
               endPtPix.getX(),endPtPix.getY());

   }

  public String textString(){
    return("Line: "+startPt.toString()+";"+endPt.toString());
  }
}