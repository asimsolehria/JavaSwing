package its.GenericDraw;

/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class Conversions {

  public static PixelPoint realToPixelPoint(RealPoint realPt,ScaleObject scale){
    return(new PixelPoint(
          (int) ((realPt.getX() - scale.getXmin()) * scale.getFactorX())
                + Constants.LEFT_MARGIN,
          scale.getPanelHeight()- Constants.TOP_MARGIN -
          (int) ( (realPt.getY() - scale.getYmin()) * scale.getFactorY() )));
  }

  public static RealPoint pixelToRealPoint(PixelPoint pixelPt,ScaleObject scale){
    int x1 = pixelPt.getX() - Constants.LEFT_MARGIN;
    int y1 = (scale.getPanelHeight()- pixelPt.getY() -
              Constants.TOP_MARGIN);
    double xr  = x1  / scale.getFactorX() + scale.getXmin();
    double yr  = y1  / scale.getFactorY() + scale.getYmin();

   return(new RealPoint(xr,yr));
  }

  public static int realLengthXtoPixels(double lx, ScaleObject scale){
    return((int) (lx * scale.getFactorX()));
  }

  public static int realLengthYtoPixels(double ly, ScaleObject scale){
    return((int) (ly * scale.getFactorY()));
  }

}