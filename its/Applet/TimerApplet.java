package its.Applet;

import javax.swing.JApplet;
import java.awt.BorderLayout;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class TimerApplet extends JApplet {

   private TimerThread timer;

   public void init(){
     TimerPanel timerPane = new TimerPanel();
     timer = new TimerThread(timerPane);
     this.getContentPane().add(timerPane,BorderLayout.CENTER);
     timer.start();
     }

   public void start(){
       System.out.println("Start");
   }

   public void stop(){
      System.out.println("Stop");
   }

   public void destroy(){
      System.out.println("Destroy");
  }
}