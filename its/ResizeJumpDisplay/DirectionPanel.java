package its.ResizeJumpDisplay;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class DirectionPanel extends JPanel {

   public DirectionPanel(PositionModel posMod, ResizeJumpFrame parent) {
    GridLayout gLayout = new GridLayout(1,4);
    this.setLayout(gLayout);
    JButton upBut    = new JButton("Up");
    JButton downBut  = new JButton("Down");
    JButton rightBut = new JButton("Right");
    JButton leftBut  = new JButton("Left");
    this.add(upBut);
    this.add(leftBut);
    this.add(rightBut);
    this.add(downBut);

    DirectionListener dirList = new DirectionListener(posMod,parent);
    upBut.addActionListener(dirList);
    downBut.addActionListener(dirList);
    rightBut.addActionListener(dirList);
    leftBut.addActionListener(dirList);

  }

}