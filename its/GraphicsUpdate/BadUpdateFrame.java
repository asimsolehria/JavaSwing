package its.GraphicsUpdate;

import javax.swing.JFrame;
import its.SimpleFrame.SimpleFrame;

/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.1
*/
public class BadUpdateFrame extends SimpleFrame{

  private UpdatePanel uppane;
  private Drawing drawing;

   public BadUpdateFrame(){
     drawing = new Drawing();
     uppane  = new UpdatePanel(drawing);
     getContentPane().add(uppane);
     pack();
   }

   public void badDemo(){
     uppane.repaint();    // paint the horizontal lines
     drawing.flipLines(); // flip them to vertical
     uppane.repaint();    // paint the vertical lines
     drawing.flipLines(); // flip them back to horizontal
     uppane.repaint ();   // paint the horizontal lines
     drawing.flipLines(); // flip them to vertical

   }

   public static void main(String[] args){
     BadUpdateFrame badFrame = new BadUpdateFrame();
     badFrame.showIt("Bad Update");
     badFrame.badDemo();
     }


}
