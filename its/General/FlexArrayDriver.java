package its.General;

import javax.swing.JFrame;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/public class FlexArrayDriver {
  public static void main(String[] args) {

   // Define a FlexArray with indexing -3,-2,..,2.
   // and fill it with i^3 at position i.
    FlexArray myArray = new FlexArray(-3,2);
    for(int i=-3; i <= 2; i++){
      myArray.setValue(i,i*i*i);
    }
    //Read a certain value
    System.out.println("Value at -2 is "+myArray.getValue(-2));
    //Read a certain value
    System.out.println("Value at 2 is "+myArray.getValue(2));
    //Read an illegal position
    System.out.println("Value at -4 is "+myArray.getValue(-4));

  }
}