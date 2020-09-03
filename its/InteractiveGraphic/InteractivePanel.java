package its.InteractiveGraphic;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class InteractivePanel extends JPanel
{

private CircleAdministration circleAdm;
private double radius = 6.0;

public InteractivePanel()
 {
   circleAdm = new CircleAdministration();
   this.setBackground(Color.white);
   this.setPreferredSize(new Dimension(300,300));
 }

public  void paintComponent(Graphics g)
 {
   super.paintComponent(g);
   circleAdm.drawAll(g);
 }

public void addCircle(int x, int y)
 {
   circleAdm.addCircle(new Circle(x,y,radius));
   repaint();
 }

public void removeNearestCircle(int x, int y)
 {
   circleAdm.removeNearestCircle(x,y);
   repaint();
 }
 
public int getNoOfCircles()
 {
   return(circleAdm.getNoOfCircles());
 }
}
