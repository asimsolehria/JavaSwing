package its.CounterInterfaceGUI;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class CounterModel {
  private int value;

  public CounterModel() {
    value = 0;
  }

  public void reset(){
    value = 0;
  }

  public void increment(){
    value++;
  }

  public void decrement(){
    value--;
  }

  public int getValue(){
    return(value);
  }
}