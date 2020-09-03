package its.GraphicsUpdate;


import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.Color;

/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.1
*/
public class UpdatePanel extends JPanel
{
  Drawing picture;

  public UpdatePanel(Drawing pic){
   picture =  pic;
   this.setBackground(Color.yellow);
   this.setForeground(Color.black);
   this.setPreferredSize(new Dimension(200,200));
  }
  public void setDrawing(Drawing pic){
    picture =  pic;
  }


   public void paintComponent(Graphics g){
    super.paintComponent(g);
    picture.draw(g);
   }

}

