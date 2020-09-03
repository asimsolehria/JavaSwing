package its.GenericDraw;

import java.util.Vector;
import java.awt.Graphics;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class Drawing {

  private Vector graphicalObjects;
  private DimensionObject extremalDimensions;
  private ScaleObject masterScale;

  public Drawing() {
    graphicalObjects   = new Vector();
    masterScale = new ScaleObject();
  }

  public int addGraphicalObject(GraphicalObject grob){
    if(graphicalObjects.size() > 0){
      extremalDimensions.combineWith(grob.dimObj);
    }
    else{
      extremalDimensions = new DimensionObject(
          grob.getDimensions().getXMin(),
          grob.getDimensions().getXMax(),
          grob.getDimensions().getYMin(),
          grob.getDimensions().getYMax() );
    }
    graphicalObjects.add(grob);
    return(grob.getUniqueNumber());
  }

  public boolean removeNearest(PixelPoint clickPtPix,
                                 int panelWidth, int panelHeight){
    boolean result = false;
    if(graphicalObjects.size() > 0){
      RealPoint clickReal = Conversions.pixelToRealPoint(clickPtPix,masterScale);
      GraphicalObject currentGO;
      double minDistance = Integer.MAX_VALUE;
      int indexOfMinDistance = -1;
      for (int i = 0; i < graphicalObjects.size(); i++) {
        currentGO = (GraphicalObject)graphicalObjects.get(i);
        if(clickReal.distanceTo(currentGO.getAnchor()) < minDistance){
          minDistance = clickReal.distanceTo(currentGO.getAnchor());
          indexOfMinDistance = i;
        }//if
      }//for i

      graphicalObjects.remove(indexOfMinDistance);
      updateScale(panelWidth,panelHeight);
    }

    return(result);
  }

  public boolean removeGraphicalObjectWithNumber(int un){
    int index = 0;
    boolean found = false;
    GraphicalObject currentGO;
    while ((index < graphicalObjects.size()) && (!found)) {
      currentGO = (GraphicalObject)(graphicalObjects.get(index));
      if(currentGO.getUniqueNumber() == un){
        found = true;
      }
      else{
        index++;
      }
    }
    if(found){
      graphicalObjects.remove(index);
      return(true);
    }
    else{
      return(false);
    }
  }

  public void drawAll(Graphics g,int panelWidth, int panelHeight){
    updateScale(panelWidth, panelHeight);
    GraphicalObject currentGO;
    for (int i = 0; i < graphicalObjects.size(); i++) {
      currentGO = (GraphicalObject)(graphicalObjects.get(i));
      currentGO.draw(g,masterScale);
      if(Constants.showAnchors){
        currentGO.drawAnchor(g,masterScale);
      }
    }
  }

  private void updateScale(int panelWidth,int panelHeight){
    if(graphicalObjects.size() > 0){
    GraphicalObject currentGO  =
        (GraphicalObject)(graphicalObjects.get(0));
    extremalDimensions = currentGO.getDimensions();
    for (int i = 1; i < graphicalObjects.size(); i++) {
      currentGO = (GraphicalObject)(graphicalObjects.get(i));
      extremalDimensions.combineWith(currentGO.getDimensions());
    }
    double f_x=
      (double)(panelWidth - Constants.LEFT_MARGIN -  Constants.RIGHT_MARGIN)/
      (extremalDimensions.getXMax() -extremalDimensions.getXMin());
    double f_y=
      (double)(panelHeight - Constants.TOP_MARGIN -  Constants.BOTTOM_MARGIN)/
      (extremalDimensions.getYMax() -extremalDimensions.getYMin());
    if(Constants.proportional){
      f_x = Math.min(f_x,f_y);
      f_y = f_x;
    }
    masterScale.setValues(extremalDimensions.getXMin(),
                          extremalDimensions.getYMin(),
                          f_x, f_y,panelHeight,panelWidth);
   }
  }

  public ScaleObject getScale(){
    return(masterScale);
  }

}