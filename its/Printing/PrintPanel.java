package its.Printing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import javax.swing.JPanel;
import javax.swing.RepaintManager;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class PrintPanel extends JPanel implements Printable {

   public PrintPanel() {
    this.setBackground(Color.white);
    this.setPreferredSize(new Dimension(300, 200));
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
     g.setColor(Color.black);
     g.drawRect(20,20,100,50);
     g.fillOval(80,80,60,30);
     g.drawString("Printing in JAVA is easy!",100,150);
     g.setColor(Color.red);
     g.drawRect(0,0,299,199);
    }

   public int print(Graphics g, PageFormat pageFormat, int pageIndex) {
    if (pageIndex > 0) {
      return(NO_SUCH_PAGE);
    } else {
      int  x = (int)pageFormat.getImageableX() + 1;
      int  y = (int)pageFormat.getImageableY() + 1;
      g.translate(x,y);
      RepaintManager currentManager = RepaintManager.currentManager(this);
      currentManager.setDoubleBufferingEnabled(false);
      this.paint(g);
      currentManager.setDoubleBufferingEnabled(true);
      return(PAGE_EXISTS);
    }
  }

}
