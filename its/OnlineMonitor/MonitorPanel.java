package its.OnlineMonitor;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class MonitorPanel extends JPanel {


  private MonitorData data;
  private int leftMargin   = 60;
  private int rightMargin  = 20;
  private int topMargin    = 20;
  private int bottomMargin = 20;

  private   MonitorThread moniThread;


  public MonitorPanel()
  {
     data = new MonitorData();
     this.setBackground(Color.white);
     moniThread = new MonitorThread(this);
     moniThread.start();
  }


  public void paintComponent(Graphics g){
   super.paintComponent(g);
   if(data.getNoOfData() > 2){
    int h = this.getHeight();
    int nettoh = h - topMargin - bottomMargin;
    int w = this.getWidth();

    double min = data.getMin();
    double max = data.getMax();

    int displaymin  = (int)(Math.floor(min/10.0) * 10.0);
    int displaymax  = (int)(Math.ceil(max/10.0) * 10.0);
    int displayspan = displaymax -displaymin;

    //Draw the coordinate system.
    g.drawLine(leftMargin,h-bottomMargin,w-rightMargin,h-bottomMargin);
    g.drawLine(leftMargin,h-bottomMargin,leftMargin,topMargin);
    //Label the coordinate system.
    g.drawString(Double.toString(displaymax),1,topMargin);
    g.drawString(Double.toString(displaymin),1,h-bottomMargin);

    double scale = (double)nettoh / (double) displayspan;

    int xe = leftMargin;
    int ye = h - bottomMargin - (int)((data.getValueAt(0) - displaymin) *scale);
    int xs,ys;

    for (int i = 1; i < data.getNoOfData(); i++)
    {
      xs = xe;
      ys = ye;
      xe = xe+1;
      ye = h - bottomMargin - (int)((data.getValueAt(i) - displaymin) *scale);
      g.drawLine(xs,ys,xe,ye);
    }
   }// if data.getNoOfData > 2
   else{
     g.drawString("No data available", 20,20);
   }
 }

 public void addData(double d){
   data.appendValue(d);
   this.repaint();
 }

 public void stop(){
   moniThread.stopThread();
 }
}
