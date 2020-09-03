package its.BlockPuzzle;
/**
* Example program for Introduction to Swing
* @hor Paul Fischer, IMM, DTU
* @version 1.1
*/
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
/* This class and the interally defined listener
 *  do most of the graphic work.
 */
public class BlockPuzzlePanel extends JPanel{

    private BoardModel boardMod;
    private ConfigurationModel currentConf;
    private int noOfRows, noOfCols;
    private int columnWidth,rowHeight;
 /* This is the constructor. It receives a reference
  * to its parent frame and a board model.
  */
    public BlockPuzzlePanel( BoardModel bm){
        boardMod = bm;
        noOfRows = bm.getNoOfRows();
        noOfCols = bm.getNoOfCols();
        this.setPreferredSize(new Dimension(300,300));
        this.setBackground(Color.white);
    }
    /* This method does the painting. It gets the current
     * configuration from the BoardModel and queries it
     * on all positions (r,c) to find which which
     * is there. The blocks are drawn as a rectangle
     * with a number near the middle. The missing block
     * is a filled black rectangle. The drawing is scalable
     * (resizeable), because we take the current width
     * and height of the panel into account.
     */
    public void paintComponent(Graphics g){
       super.paintComponent(g);
       int w = getWidth();
       int h = getHeight();
       columnWidth = w/noOfCols;
       rowHeight = h/noOfRows;
       currentConf = boardMod.getCurrentConfiguration();
       for(int r=0; r < noOfRows; r++){
        for(int c=0; c < noOfCols; c++){
           if(currentConf.getBlockNo(r,c) != 0){
              drawBlock(r,c,currentConf.getBlockNo(r,c),g);
           }
           else
           {
              drawMissingBlock(r,c,g);
           }
         }//for c
       }//for r
    }
    /*  This method makes the move by calling the respective
     *  method of class BoardModel. If the move has been made,
     *  the panel updates the display. Otherwise, an error
     *  message is shown. Note, that the panel does not know
     *  how to make a move.
     */
     public void makeMove(MoveModel move){
     if(boardMod.moveIt(move)){
        this.repaint();
     }
     else{
        JOptionPane.showMessageDialog(this,
        "Illegal Move","ITS BlockPuzzle",
         JOptionPane.WARNING_MESSAGE);
      }//ifelse
     }
    /* This method draws a block. The body of it
     * could have be put directly into  paintComponent
     * but if one has to draw many difficult things it
     * give a more clear structure to uses separate methods.
     */
    private void drawBlock(int r, int c, int n, Graphics g){
         g.drawRect(c*columnWidth+2,r*rowHeight+2,columnWidth-4,rowHeight-4);
         g.drawString(""+n,c*columnWidth+(columnWidth/2),r*rowHeight+rowHeight/2);
    }
   /* This method draws the missing  block. */
    private void drawMissingBlock(int r, int c,  Graphics g){
         g.fillRect(c*columnWidth,r*rowHeight,columnWidth,rowHeight);
    }
    /* This method determines the number of the block
     * into which the pixel coordinates (x,y) fall.
     */
    public int getBlockNoAtPixels(int x,int y){
       int c =  x/(this.getWidth()/noOfCols);
       int r =  y/(this.getHeight()/noOfRows);
       return(currentConf.getBlockNo(r,c));
    }
}
