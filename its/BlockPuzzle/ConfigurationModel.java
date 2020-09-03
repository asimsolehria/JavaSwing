package its.BlockPuzzle;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.1
*/
 /** This class stores a configuration of the
  * game. This is the current position of all
  * the pieces. The numbers are stored in a
  * 2-dimensional array.
  * It can be used to save a game.
  */
public class ConfigurationModel {

 private int[][] board;
 int noOfRows, noOfCols;
  /** The constructor receives a 2-dim array
   *  and copies it. Copying it important!!
   *  If one only copies the reference (i.e,
   *  board = b;) then a change in b will be
   *  a change in board.
   */
  public ConfigurationModel(int[][] b) {
   noOfRows = b.length;
   noOfCols = b[0].length;
   board = new int[noOfRows][noOfCols];
   for (int r=0;r < noOfRows ; r++ ) {
    for (int c=0;c < noOfCols ; c++ ) {
     board[r][c] = b[r][c];
     }//for
   }//for
  }
/** Returns the number of the block at position (r,c).
 */
public int getBlockNo(int r, int c){
 return(board[r][c]);
}
  /** Constructs a string out of the configutration.
   *  The numbers of the pieces are written row wise
   *  from left to right separated by blanks.
   *  Rows are separated by newline commands.
   *  are separated by a vertical slash and the string
   *  This method can be used for storing configrations
   *  and for testing the model in a non-graphical environment.
   */
  public String toString(){
   String confAsString = "";
   for(int r=0; r < noOfRows; r++){
        for(int c=0; c < noOfCols; c++){
           if(board[r][c] < 10)
           {
            confAsString += "  "+board[r][c];
           }
           else
           {
            confAsString += " "+board[r][c];
           }//ifelse
        }//for c
       confAsString += "\n";
      }//for r
    confAsString += "\n";
    return(confAsString);
   }
   /* This method compares two configrations and
    * returns true if they are equal and false otherwise
    */
    public boolean equals(ConfigurationModel conf){
      boolean result = true;
      for(int r=0; r < noOfRows; r++){
        for(int c=0; c < noOfCols; c++){
           if(this.board[r][c] != conf.board[r][c]){
              result = false;
           }//if
        }//for c
      }//for r
      return(result);
     }
}
