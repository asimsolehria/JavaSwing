package its.ResizeDisplay;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
/**
* Example program for Introduction to Swing
* @hor Paul Fischer, IMM, DTU
* @version 1.0
*/
public class ResizePanel extends JPanel{

   public ResizePanel(){
     this.setBackground(Color.yellow);
   }

   public void paintComponent(Graphics g)
   {
     super.paintComponent(g);
     // get the current dimensions of the panel
     int currentWidth  = this.getWidth();
     int currentHeight = this.getHeight();

     // take a third of the current dimensions
     int wThird  = currentWidth/3;
     int hThird  = currentHeight/3;
  //set color to black
     g.setColor(Color.black);
  // and draw the rectangle
     g.fillRect(wThird,hThird,wThird,hThird);
    }


}
