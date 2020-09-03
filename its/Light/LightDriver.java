package its.Light;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class LightDriver {
  public static void main(String[] args) {
   LightModel lm = new LightModel();
   LightFrame lf = new LightFrame(lm);
   lf.showIt();
  }
}