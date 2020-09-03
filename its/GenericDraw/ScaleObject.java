package its.GenericDraw;

/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class ScaleObject{

  private double xmin, ymin, factorX, factorY;
  private int panelHeight, panelWidth;

  public ScaleObject(double xmi, double ymi, double fx, double fy,
                     int ph, int pw) {
    xmin    = xmi;
    ymin    = ymi;
    factorX = fx;
    factorY = fy;
    panelHeight = ph;
    panelWidth  = pw;
  }

  public ScaleObject() {
    xmin    = 0.0;
    ymin    = 0.0;
    factorX = 0.0;
    factorY = 0.0;
    panelHeight = 10;
    panelWidth  = 10;
  }

  public void setValues(double xmi, double ymi, double fx, double fy,
                        int ph, int pw) {
    xmin    = xmi;
    ymin    = ymi;
    factorX = fx;
    factorY = fy;
    panelHeight = ph;
    panelWidth  = pw;
 }

  public double getXmin(){
    return(xmin);
  }

  public double getYmin(){
    return(ymin);
  }

  public double getFactorX(){
    return(factorX);
  }

  public double getFactorY(){
    return(factorY);
  }

  public int getPanelHeight(){
    return(panelHeight);
  }

  public int getPanelWidth(){
    return(panelWidth);
  }

}