package its.GenericDraw;

import java.awt.Graphics;
import java.awt.Color;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public abstract class GraphicalObject {

  private static int nextUniqueNumber = 0;

  protected RealPoint anchor;
  protected DimensionObject dimObj;
  protected Color color;

  private int uniqueNumber;

  public GraphicalObject() {
    uniqueNumber = nextUniqueNumber;
    nextUniqueNumber++;
    anchor = new RealPoint(0.0,0.0);
    color  = Color.black;
  }

  public void setColor(Color c){
    color = c;
  }

  public int getUniqueNumber(){
    return(uniqueNumber);
  }

  public DimensionObject getDimensions(){
    return(dimObj);
  }

  public void drawAnchor(Graphics g, ScaleObject scale){
     if (anchor == null) {
      System.out.println("ERROR in GraphicalObject: Anchor undifined");
    }
    else {
     PixelPoint anchorPix = Conversions.realToPixelPoint(anchor,scale);
     Color oldColor = g.getColor();
     g.setColor(Constants.ANCHOR_COLOR);
     g.fillOval(anchorPix.getX() - Constants.ANCHOR_RADIUS,
                anchorPix.getY() - Constants.ANCHOR_RADIUS,
                2*Constants.ANCHOR_RADIUS,
                2*Constants.ANCHOR_RADIUS);
     g.setColor(oldColor);
    }
  }

  public RealPoint getAnchor(){
    return(anchor);
  }

  public abstract void draw(Graphics g, ScaleObject scale);

  public abstract String textString();


}