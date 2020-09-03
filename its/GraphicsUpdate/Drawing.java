package its.GraphicsUpdate;

import java.awt.Graphics;

/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.1
*/
public class Drawing {
  private Line[] lines = new Line[3];

  public Drawing(){
    lines[0] = new Line(0);
    lines[1] = new Line(1);
    lines[2] = new Line(2);
  }


  public void flipLines(){
     lines[0].flip();
     pause(1000);
     lines[1].flip();
     pause(1000);
     lines[2].flip();
     pause(1000);
 }

  public void draw(Graphics g){
     lines[0].draw(g);
     lines[1].draw(g);
     lines[2].draw(g);
  }

  public void copy(Drawing dra){
    lines[0].copy(dra.lines[0]);
    lines[1].copy(dra.lines[1]);
    lines[2].copy(dra.lines[2]);
  }


   public static void pause(long z){
     try {
       Thread.sleep(z);
     }
     catch (Exception ex) {
       ex.printStackTrace();
     }
   }
  }


class Line{
  int startX, startY, endX, endY;

   Line(int lineNo){
       startX = 20;
       endX   = 180;
       startY = 50 + lineNo*50;
       endY   = startY;
   }


   public void copy(Line l){
      this.startX  = l.startX;
      this.endX    = l.endX;
      this.startY  = l.startY;
      this.endY    = l.endY;
   }

   public void flip(){
     int help;
     help   = startX;
     startX = startY;
     startY = help;
     help   = endX;
     endX   = endY;
     endY   = help;
   }

   public void draw(Graphics g){
     g.drawLine(startX, startY, endX, endY);
   } 

}
