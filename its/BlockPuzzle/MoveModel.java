package its.BlockPuzzle;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.1
*/
 /* This class implements an abstract move.
  * its two parameters are the move direction.
  * and the number of the piece to be moved.
  */
public class MoveModel {

  private int direction;
  private int blockNumber;

  public MoveModel(int dir, int bn) {
    direction = dir;
    blockNumber = bn;
  }

   public int getBlockNumber(){
    return(blockNumber);
  }

  public int getDirection(){
    return(direction);
  }
}
