package its.BlockPuzzle;

import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
/**
* Example program for Introduction to Swing
* @hor Paul Fischer, IMM, DTU
* @version 1.0
*/
/* A panel with four radio buttons on top of one
 * another. The buttons reflect the four possible
 * directions of a move.
 */
public class DirectionPanel extends JPanel {
  private JRadioButton upBut, downBut, rBut, lBut;
  private ButtonGroup group;

  public DirectionPanel(){
    this.setLayout(new GridLayout(4,1));
    upBut   = new JRadioButton("up");
    downBut = new JRadioButton("down");
    lBut    = new JRadioButton("left");
    rBut    = new JRadioButton("right");

    upBut.setActionCommand("u");
    downBut.setActionCommand("d");
    lBut.setActionCommand("l");
    rBut.setActionCommand("r");

    group = new ButtonGroup();
    group.add(upBut);
    group.add(downBut);
    group.add(lBut);
    group.add(rBut);
    upBut.setSelected(true);

    this.add(upBut);
    this.add(downBut);
    this.add(lBut);
    this.add(rBut);
   }
  /* This method returns the ActionCommand of the
   * currenly selected radio button.
   */
  public int getDirection(){
    String actionCommand = group.getSelection().getActionCommand();
    int result = 0;
    if(actionCommand.equals("u")){
     result = Constants.DIRECTION_UP;
    } else if(actionCommand.equals("d")){
     result = Constants.DIRECTION_DOWN;
    } else if(actionCommand.equals("r")){
     result = Constants.DIRECTION_RIGHT;
    } else if(actionCommand.equals("l")){
     result = Constants.DIRECTION_LEFT;
    }
    return( result );
  }
}