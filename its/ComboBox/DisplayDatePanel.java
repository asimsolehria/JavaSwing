package its.ComboBox;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class DisplayDatePanel extends JPanel
{
  public JLabel displayLabel;
  public DisplayDatePanel()
  {
  displayLabel = new JLabel("01.January 2004");
  this.setLayout(new GridLayout(1,2));
  this.add(new JLabel("Selected date:  "));
  this.add(displayLabel);
  }

  public void setDate(String d)
  {
    displayLabel.setText(d);
  }
}