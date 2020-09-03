package its.CounterGUI;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/public class CounterModel {
  private int value;

 // The constructor initializes the counter to  0
  public CounterModel() {
    value = 0;
  }

  public void increment(){
    value++;
  }

  public void decrement(){
    value--;
  }

  public void reset(){
    value = 0;
  }

  public int getValue(){
    return(value);
  }
}
