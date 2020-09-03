package its.Light;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class LightModel {
   private int currentColors;

   /** The constructor initializes a light
    *  that shows red.
    */
   public LightModel() {
    currentColors = Constants.LIGHT_RED;
   }
   /** This method proceeds from one color-combination
    *  to the next one.
    */
   public void nextColor(){
     switch (currentColors) {
       case Constants.LIGHT_RED:
         currentColors = Constants.LIGHT_RED_ORANGE;
         break;
      case  Constants.LIGHT_RED_ORANGE:
         currentColors = Constants.LIGHT_GREEN;
         break;
      case  Constants.LIGHT_GREEN:
         currentColors = Constants.LIGHT_ORANGE;
         break;
      case  Constants.LIGHT_ORANGE:
         currentColors = Constants.LIGHT_RED;
         break;
        default:
         System.out.println("ERROR: ILLEGAL COLOR COMBINATION!");
         break;
     }
  }
   /** Returns the (code of the) current color combination
    *
    */
   public int getCurrentColors(){
    return(currentColors);
   }

   /** Prints the current color combination
    *  to standard output.
    */
   public void printColor(){
     switch (currentColors) {
       case Constants.LIGHT_RED:
         System.out.println("RED");
         break;
      case  Constants.LIGHT_RED_ORANGE:
         System.out.println("RED&ORANGE");
         break;
      case  Constants.LIGHT_GREEN:
         System.out.println("GREEN");
         break;
      case  Constants.LIGHT_ORANGE:
         System.out.println("ORANGE");
         break;
        default:
         System.out.println("ERROR: ILLEGAL COLOR COMBINATION!");
         break;
     }
  }
}