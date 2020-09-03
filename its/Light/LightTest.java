package its.Light;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class LightTest {
  public static void main(String[] args) {
    LightModel light = new LightModel();
    for (int i = 0;i < 10 ;i++ ) {
     light.printColor();
     light.nextColor();
    }//for

  }
}