package its.ResizeJumpDisplay;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
/** Defines an abstract position as fractions
 *  independent of the current size of the panel.
 *  WARNING, NO test of plausibility of the
 *  position are implemented!
 */
public class PositionModel {
   // We allow the positions for the upper
   // left corner of the black rectangle to
   // be only at:
   // 0/stepNo, 1/stepNo,...,allowedMax/stepNo
   // of the current width or heigth of the panel.
   // With the choice below this is
   // 0/9, 1/9, 2/9, 3/9, 4/9, 5/9, and 6/9.

   private static final int stepNo     = 9;
   private static final int allowedMax = 6;

   // The next variable specifies the length and
   // height of the blackt rectange as a number
   // of steps. Here we take 3.

   private static final int blackRectSteps = 3;

   // the next two variables contain the
   // current position of the black rectangle
   // (in fractions of the current width and height
   // of the panel.


   private int upperLeftX, upperLeftY;

  public PositionModel(int x, int y) {
    upperLeftX = x;
    upperLeftY = y;
  }

  /** the next three methods return the current position
   *  and the number of steps */
  public int getXInSteps(){
   return(upperLeftX);
  }

  public int getYInSteps(){
   return(upperLeftY);
  }

  public int getNoOfSteps(){
   return(stepNo);
  }
  public int getBlackSizeInSteps(){
   return(blackRectSteps);
  }



  /** the next four methods move the position */
  public void moveDown(){
    if(upperLeftY < allowedMax){
      upperLeftY++;
    }
  }

  public void moveUP(){
    if(upperLeftY > 0){
      upperLeftY--;
    }
  }

  public void moveRight(){
    if(upperLeftX < allowedMax){
      upperLeftX++;
    }
  }  public void moveLeft(){
    if(upperLeftX > 0){
      upperLeftX--;
    }
  }



}