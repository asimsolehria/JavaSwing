package its.Applet;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class TimerPanel extends JPanel {

   private int time;

  public TimerPanel() {
    this.setBackground(Color.yellow);
    time = 0;
  }

  public void paintComponent(Graphics g){
    super.paintComponent(g);
    g.drawString(Integer.toString(time), 50,50);
  }


  public void setTime(int t){
    time = t;
    this.repaint();
  }



}