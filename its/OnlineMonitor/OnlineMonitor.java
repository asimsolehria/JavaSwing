package its.OnlineMonitor;

import javax.swing.JFrame;
import AnimatingControlsSurface;
import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.1
*/
public class OnlineMonitor extends JFrame {

  public  MonitorPanel moniPane;

  public OnlineMonitor() {
    moniPane = new MonitorPanel();
    this.setSize(500,200);
    this.getContentPane().add(moniPane,BorderLayout.CENTER);
    this.setTitle("Online Monitor");
    CleanUpAdapter cleaner = new CleanUpAdapter();
    this.addWindowListener(cleaner);
  }

  private  void cleanUp(){
    moniPane.stop();
    System.exit(0);
  }

  public static void main(String[] args) {
    OnlineMonitor onlineMoni = new OnlineMonitor();
    onlineMoni.show();
  }

  private class CleanUpAdapter extends WindowAdapter{

    public void windowClosing(WindowEvent e)
           {
             cleanUp();
           }
 }// internal class
}