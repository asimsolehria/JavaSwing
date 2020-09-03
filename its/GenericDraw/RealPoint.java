package its.GenericDraw;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class RealPoint{
   private double x, y;

   public RealPoint(double xx, double yy){
     x = xx;
     y = yy;
   }

  public double getX(){
    return(x);
   }

   public double getY(){
    return(y);
   }

   public double distanceTo(RealPoint p){
     return(Math.sqrt(Math.pow((this.x-p.x),2)+Math.pow((this.y-p.y),2)));
   }

   public String toString(){
     return("("+x+";"+y+")");
   }
}//class


