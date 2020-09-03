package its.CleanUpFrame;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
import javax.swing.JFrame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CleanUpFrame extends JFrame
{
  public CleanUpFrame()
  {
     this.setSize(200,200);
     this.setLocation(200,200);
     this.setTitle("CleanUpFrame");
     CleanUpAdapter cleaner = new CleanUpAdapter();
     this.addWindowListener(cleaner);
  }

  public void showIt(){
    this.setVisible(true);
  }

   public void hideIt(){
    this.setVisible(false);
  }

  // Performs the clean up work before terminating the application.
  private static void cleanUp(){
    // Real code for the clean up goes here.
    System.out.println("Cleaning up and then terminating the program.");
    System.exit(0);
  }
  // Internal class
  private class CleanUpAdapter extends WindowAdapter{

   public void windowClosing(WindowEvent we)
          {
            // Call the cleanUp method of the frame.
            cleanUp();
          }
 }// internal class
}
