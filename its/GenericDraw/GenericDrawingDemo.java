package its.GenericDraw;

import javax.swing.JFrame;
import java.awt.Color;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class GenericDrawingDemo extends JFrame {

  public GenericDrawingDemo() {
  //set up the frame
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(400,250);
    this.setTitle("Generic Drawing application");
  //generate the panel and add it to the frame
    GenericDrawPanel canvas = new GenericDrawPanel();
    this.getContentPane().add(canvas );
  //create two circles and add them to the panel
    RealPoint center1 = new RealPoint(1.0,1.0);
    RealPoint center2 = new RealPoint(3.0,3.0);
    double rad1 = 1.0;
    double rad2 = 2.27;
    Circle circ1 = new Circle(center1, rad1);
    Circle circ2 = new Circle(center2, rad2);
    circ1.setColor(Color.green);
    canvas.addGraphicalObject(circ1);
    canvas.addGraphicalObject(circ2);
  //create a line and add it to the panel
    RealPoint l0  = new RealPoint(-2.0,4.3);
    RealPoint l1  = new RealPoint(3.7,-1.5);
    Line line = new Line(l0,l1);
    line.setColor(Color.red);
    canvas.addGraphicalObject(line);
  //create an open polygon with 5 points and add
  //it to the panel
    RealPoint[] corners = new RealPoint[5];
    corners[0] = new RealPoint(-3.2,-0.4);
    corners[1] = new RealPoint(-1.2,1.5);
    corners[2] = new RealPoint(1.3,0.1);
    corners[3] = new RealPoint(-2.4,1.3);
    corners[4] = new RealPoint(2.3,2.3);
    OpenPolygon opol = new OpenPolygon(corners);
    opol.setColor(Color.blue);
    canvas.addGraphicalObject(opol);
  }

  public static void main(String[] args) {
    GenericDrawingDemo gdd = new GenericDrawingDemo();
    gdd.setVisible(true);
  }
}