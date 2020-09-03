package its.GenericDraw;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class PixelPoint{
   private int x, y;

   public PixelPoint(int xx, int yy){
     if((xx >= 0) && (yy >= 0)){
       x = xx;
       y = yy;
     }
     else
     {
      System.out.println("ERROR: Illegal pixel coordinates.");
     }
   }

   public int getX(){
    return(x);
   }

   public int getY(){
    return(y);
   }

   public String toString(){
     return("["+x+";"+y+"]");
   }
}//class