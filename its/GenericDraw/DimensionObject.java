package its.GenericDraw;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class DimensionObject {

  private double xmin, xmax, ymin, ymax;

  public DimensionObject(double xmi, double xma, double ymi, double yma) {
    xmin = xmi;
    xmax = xma;
    ymin = ymi;
    ymax = yma;
  }

  public double getXMin(){
    return(xmin);
  }

  public double getXMax(){
    return(xmax);
  }

  public double getYMin(){
    return(ymin);
  }

  public double getYMax(){
    return(ymax);
  }

  public void combineWith(DimensionObject dimOb){
    this.xmin = Math.min(this.xmin,dimOb.xmin);
    this.xmax = Math.max(this.xmax,dimOb.xmax);
    this.ymin = Math.min(this.ymin,dimOb.ymin);
    this.ymax = Math.max(this.ymax,dimOb.ymax);
  }
}