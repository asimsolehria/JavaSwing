package its.Applet;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class TimerThread extends Thread {

  private int time;
  private TimerPanel timerPane;

  public TimerThread(TimerPanel tp) {
    time = 0;
    timerPane = tp;
  }

  public void run(){
    while(true){
    try {
      Thread.sleep(500L);
      time += 500;
      System.out.println("Running "+time);
      timerPane.setTime(time);
    }
    catch (InterruptedException ex) {
    }
    }
  }
}