package its.BlockPuzzle;

/**
* Example program for Introduction to Swing
* @auhor Paul Fischer, IMM, DTU
* @version 1.1
*/
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.BorderLayout;
import javax.swing.JFrame;

  /* Class defines the main frame for displaying the
   * game. It gerates a BoardModel of the desired
   * size. The graphics is  displayed in the a panel
   * of type BlockPuzzlePanel. This is the central component
   * of the frame. The BlockPuzzlePanel also receives
   * the board model. At right (East) there is a panel
   * of type DirectionPanel, where the user can select
   * the direction of the move.
   */
public class BlockPuzzleFrame extends JFrame
{
  private DirectionPanel dirPanel;
  private BlockPuzzlePanel bpPanel;

  // Constructor
  public BlockPuzzleFrame(int rows, int cols)  {

     this.setLocation(200,200);
     this.setTitle("ITS Block Puzzle");
     BoardModel boardMod = new  BoardModel(rows,cols);
     bpPanel = new BlockPuzzlePanel(boardMod);
     dirPanel = new DirectionPanel();
     getContentPane().add(bpPanel,BorderLayout.CENTER);
     getContentPane().add(dirPanel,BorderLayout.EAST);

     BlockPuzzleListener bpList = new BlockPuzzleListener(bpPanel,dirPanel);
     bpPanel.addMouseListener(bpList);

     // Correct termination:
     // Otherwise only the frame disappears when clicking
     // on the "close" symbol but the process keeps running.
     addWindowListener(new WindowAdapter()
         { public void windowClosing(WindowEvent e)
          {
             System.exit(0);
          }
     });
     pack();
  }

  /* Makes the frame visible */
  public void showIt(){
    this.setVisible(true);
  }


  /* Makes the frame invisible */
  public void hideIt(){
    this.setVisible(false);
  }


 }