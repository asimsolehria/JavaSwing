package its.BlockPuzzle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.1
*/
    /* This Listener keeps an eye on the mouse while
     * it is in the panel. If the mouse is clicked
     * it detects (roughly) on which piece the click
     * occurred. Then it gets the direction of the
     * move from the MotionPanel a and asks the
     * panel to make the move.
     * References to the BlockPuzzlePanel and the DirectionPanel
     * are passed in the constructor.
     */
 public  class BlockPuzzleListener extends MouseAdapter{
       private DirectionPanel dirPanel;
       private BlockPuzzlePanel bpPanel;
      /** Construtor */
      BlockPuzzleListener (BlockPuzzlePanel bp, DirectionPanel m){
        dirPanel =  m;
        bpPanel = bp;
       }
      /** On a mouse click the listener determines
       *  the piece number and direction. It constructs
       *  a MoveModel object and requests the move
       *  from the block puzzle panel.
       */
       public void mouseClicked(MouseEvent evt){
   //
         int x =  evt.getX();
         int y =  evt.getY();
         int blockNo = bpPanel.getBlockNoAtPixels(x,y);
     // Constructs the move
         MoveModel move =
             new MoveModel(dirPanel.getDirection(),blockNo);
     //  Request a move to made inthe BlockPuzzlePanel.
     //  Note, that the BlockPuzzleListener does mot know HOW to make
     //  a move.
        bpPanel.makeMove(move);
     }

}