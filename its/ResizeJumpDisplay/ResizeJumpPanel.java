package its.ResizeJumpDisplay;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
/**
* Example program for Introduction to Swing
* @hor Paul Fischer, IMM, DTU
* @version 1.0
*/
public class ResizeJumpPanel extends JPanel{


   private PositionModel posModel;

   public ResizeJumpPanel(PositionModel pm){
     posModel = pm;
     this.setBackground(Color.yellow);
   }

   public void paintComponent(Graphics g)
   {
     super.paintComponent(g);
     // get the current dimensions of the panel in pixels
     int currentWidth  = this.getWidth();
     int currentHeight = this.getHeight();

     // copmute the current size of a step in pixels
     int hStepInPixels  = currentWidth/posModel.getNoOfSteps();
     int vStepInPixels  = currentHeight/posModel.getNoOfSteps();

     // compute the pixel positions of the
     // upper left corner of the black rectange
     // and its width and height.
     int upperLeftX = posModel.getXInSteps() * hStepInPixels;
     int upperLeftY = posModel.getYInSteps() * vStepInPixels;
     int blackWidth =  hStepInPixels * posModel.getBlackSizeInSteps();
     int blackHeight=  vStepInPixels * posModel.getBlackSizeInSteps();

     //set color to black
     g.setColor(Color.black);

     // and draw the rectangle

     g.fillRect(upperLeftX,upperLeftY,blackWidth,blackHeight);

   }


}
