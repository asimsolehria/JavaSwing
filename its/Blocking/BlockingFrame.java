package its.Blocking;

import its.SimpleFrame.SimpleFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class BlockingFrame extends SimpleFrame
{

  private JLabel display;

  public  BlockingFrame(){
    display = new JLabel("Nothing happened");
    this.getContentPane().add(display);

    JMenuBar menuBar    = new  JMenuBar();
    this.setJMenuBar(menuBar);
    JMenu    menu       = new  JMenu("Menu1");
    menuBar.add(menu);
    JMenuItem startItem = new  JMenuItem("Start");
    menu.add(startItem);
    MenuListener mListener = new  MenuListener();
    startItem.addActionListener(mListener);
  }

  public static void main(String[] args){
      System.out.println("Running in thread "+Thread.currentThread().getName());

      BlockingFrame bf = new BlockingFrame();
      bf.showIt("BlockingFrame");
  }

  private void lengthyWork(){
     //This is the lengthy work
        for(int i = 0; i < 10; i++){
          System.out.println("Working "+i);
          System.out.println("Running in thread "+Thread.currentThread().getName());
          display.setText("Working "+i);
          try{
            Thread.sleep(500);
          }catch(Exception ex){
            ex.printStackTrace();
          }
        }//for i
       display.setText("Done");
  }

 //Internal class
  class  MenuListener implements ActionListener{

    public void actionPerformed(ActionEvent evt){

    String command = evt.getActionCommand();
    if(command.equals("Start")){
       lengthyWork();
    }
    else
    {
      System.out.println("Unknown ActionCommand");
      System.exit(0);
    }
   }
  }//internal class
}
