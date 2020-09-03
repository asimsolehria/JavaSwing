package its.Applet;

import javax.swing.JApplet;
import its.CounterGUI.CounterPanel;
import java.awt.BorderLayout;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class CounterApplet extends JApplet {

  public void init(){
   CounterPanel cPane = new CounterPanel();
   this.getContentPane().add(cPane,BorderLayout.CENTER);
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