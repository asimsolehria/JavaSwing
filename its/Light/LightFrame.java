package its.Light;

import its.SimpleFrame.SimpleFrame;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class LightFrame extends SimpleFrame {

  private JPanel redPanel,orangePanel,greenPanel;
  private LightModel light;

  public LightFrame(LightModel lm) {
    light = lm;
    this.getContentPane().setLayout(new GridLayout(4,1));
    redPanel    = new JPanel();
    orangePanel = new JPanel();
    greenPanel  = new JPanel();
    JButton nextButton = new JButton("Next");
    LightListener lightList = new LightListener(this);
    nextButton.addActionListener(lightList);


    this.getContentPane().add(redPanel);
    this.getContentPane().add(orangePanel);
    this.getContentPane().add(greenPanel);
    this.getContentPane().add(nextButton);
    System.out.println("c="+light.getCurrentColors());
    setColor(light.getCurrentColors());
         this.repaint();
  }

  /** sets the collors of the display according
   *  to the current status of the Light model.
   */
  private void setColor(int color){
    switch (color) {
      case Constants.LIGHT_RED:
         redPanel.setBackground(Color.red);
         orangePanel.setBackground(Color.lightGray);
         greenPanel.setBackground(Color.lightGray);
        break;
      case Constants.LIGHT_RED_ORANGE:
         redPanel.setBackground(Color.red);
         orangePanel.setBackground(Color.orange);
         greenPanel.setBackground(Color.lightGray);
        break;
      case Constants.LIGHT_GREEN:
         redPanel.setBackground(Color.lightGray);
         orangePanel.setBackground(Color.lightGray);
         greenPanel.setBackground(Color.green);
        break;
      case Constants.LIGHT_ORANGE:
         redPanel.setBackground(Color.lightGray);
         orangePanel.setBackground(Color.orange);
         greenPanel.setBackground(Color.lightGray);
        break;
      default:
         System.out.println("ERROR: ILLEGAL COLOR COMBINATION!");
        break;
    }//Switch
  }

  /** Advances the colors of the model and
   *  displays the new colors.
   */
  public void showNextColors(){
    light.nextColor();
    this.setColor(light.getCurrentColors());
  }
}