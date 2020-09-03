package its.GraphicsUpdate;

import javax.swing.JFrame;
import its.SimpleFrame.SimpleFrame;

/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.1
*/
public class GoodUpdateFrame extends SimpleFrame{

  private UpdatePanel uppane;
  private Drawing drawing1, drawing2;

   public GoodUpdateFrame(){
     drawing1 = new Drawing();
     drawing2 = new Drawing();
     uppane = new UpdatePanel(drawing1);
     getContentPane().add(uppane);
     pack();
   }

   public void goodDemo(){
     uppane.repaint();
     drawing2.flipLines();
     uppane.setDrawing(drawing2);
     uppane.repaint();
     drawing1.copy(drawing2);
     drawing1.flipLines();
     uppane.setDrawing(drawing1);
     uppane.repaint ();
   }

   public static void main(String[] args){
     GoodUpdateFrame goodFrame = new GoodUpdateFrame();
     goodFrame.showIt("Good Update"); // The drawing contains
     goodFrame.goodDemo();
   }


}