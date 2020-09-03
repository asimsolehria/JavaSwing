package its.GenericDraw;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class GenericDrawPanel extends JPanel {
  private BorderLayout borderLayout1 = new BorderLayout();

  private Drawing drawing;

  public GenericDrawPanel() {
     this.setBackground(Color.white);
     drawing = new Drawing();
     GenericDrawMouseAdapter mouseAdpt = new GenericDrawMouseAdapter();
     this.addMouseListener(mouseAdpt);
   }

 public int addGraphicalObject(GraphicalObject go){
   int uniqueNum = drawing.addGraphicalObject(go);
   this.repaint();
   return(uniqueNum);
 }

 public boolean removeNearest(PixelPoint clickPt){
   boolean result = drawing.removeNearest(clickPt,this.getWidth(),this.getHeight());
   this.repaint();
   return(result);
 }

  public boolean removeGraphicalObjectWithNumber(int un){
    boolean result = drawing.removeGraphicalObjectWithNumber(un);
    this.repaint();
    return(result);
 }

  public void paintComponent(Graphics g){
    super.paintComponent(g);
    drawing.drawAll(g,this.getWidth(),this.getHeight());
  }

//Internal classes
class GenericDrawMouseAdapter extends MouseAdapter{
  private boolean lineStarted;
  private PixelPoint startPt,endPt;

  public GenericDrawMouseAdapter(){
    lineStarted = false;
  }


  public void mouseClicked(MouseEvent e)
  {
  if(SwingUtilities.isLeftMouseButton(e))
   {
     if(lineStarted){
       endPt = new PixelPoint(e.getX(),e.getY());
       lineStarted = false;
       RealPoint startPtPix =
          Conversions.pixelToRealPoint(startPt,drawing.getScale());
       RealPoint endPtPix =
              Conversions.pixelToRealPoint(endPt,drawing.getScale());
       Line line = new Line(startPtPix,endPtPix);
       addGraphicalObject(line);
     }
     else {
      startPt = new PixelPoint(e.getX(),e.getY());
      lineStarted = true;
     }// if lineStarted
    }// if left mouse button
    else
    {
      removeNearest(new PixelPoint(e.getX(),e.getY()));
    }// if rigth mouse button
   }// mouseClicked
  }

}