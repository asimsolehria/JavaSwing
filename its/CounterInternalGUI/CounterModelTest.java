package its.CounterInternalGUI;

import javax.swing.JPanel;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class CounterModelTest {

  private static  boolean passed = true;

  public static void main(String[] args) {
     CounterModel cm = new CounterModel();

     checkValue(0,cm.getValue());
     cm.increment();
     checkValue(1,cm.getValue());
     cm.decrement();
     checkValue(0,cm.getValue());
     for (int i = 0; i < 37; i++) {
       cm.increment();
     }
     checkValue(37,cm.getValue());
     for (int i = 0; i < 21; i++) {
        cm.decrement();
      }
     checkValue(16,cm.getValue());
     cm.reset();
     checkValue(0,cm.getValue());

     if(passed){
       System.out.println("Test passed.");
     }
     else{
       System.out.println("test NOT passed.");
     }
  }

  public static void checkValue(int expectedValue, int trueValue){
    if(expectedValue == trueValue){
      System.out.println("Values are both equal to "+expectedValue);
    }
    else{
       System.out.println("ERROR expected value "+expectedValue+
                          " and true value "+trueValue+" differ!");
       passed = false;
    }
  }
}
