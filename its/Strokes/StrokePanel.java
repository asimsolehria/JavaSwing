package its.Strokes;

import javax.swing.JPanel;
import java.awt.*;


public class StrokePanel extends JPanel {

  private BasicStroke stroke1, stroke3round, stroke3butt,
                      stroke10round, stroke10butt,
                      stroke16blev, stroke16mite, stroke16roun;


  public StrokePanel() {
   this.setPreferredSize(new Dimension(400,300));
   this.setBackground(Color.white);

   stroke1       = new BasicStroke(1.0f);
   stroke3round  = new BasicStroke(3.0f,BasicStroke.CAP_ROUND,BasicStroke.JOIN_BEVEL);
   stroke3butt   = new BasicStroke(3.0f,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
   stroke10round = new BasicStroke(10.0f,BasicStroke.CAP_ROUND,BasicStroke.JOIN_BEVEL);
   stroke10butt  = new BasicStroke(10.0f,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
   stroke16blev  = new BasicStroke(16.0f,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
   stroke16mite  = new BasicStroke(16.0f,BasicStroke.CAP_BUTT,BasicStroke.JOIN_MITER);
   stroke16roun  = new BasicStroke(16.0f,BasicStroke.CAP_BUTT,BasicStroke.JOIN_ROUND);

  }

  public void paintComponent(Graphics g){
    super.paintComponent(g);
    Graphics2D g2d = (Graphics2D) g;
    g2d.setStroke(stroke1);
    g2d.drawLine(10,0,10,100);
    g2d.drawLine(100,0,100,100);
    g2d.setColor(Color.red);
    g2d.setStroke(stroke10round);
    g2d.drawLine(10,10,100,10);
    g2d.setStroke(stroke10butt);
    g2d.drawLine(10,40,100,40);

      g2d.setColor(Color.green);
      g2d.setStroke(stroke16blev);
      g2d.drawRect(10,200,80,60);
      g2d.setStroke(stroke16mite);
      g2d.drawRect(120,200,80,60);
      g2d.setStroke(stroke16roun);
      g2d.drawRect(230,200,80,60);


  }
}