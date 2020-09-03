package its.Borders;

import java.awt.*;
import javax.swing.JPanel;
import javax.swing.border.*;
import javax.swing.BorderFactory;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class BorderPanel extends JPanel
{
  public BorderPanel()
  {
     this.setBackground(Color.lightGray);
     Border bdr      = BorderFactory.createEtchedBorder();
     this.setBorder(bdr );
  }
 public BorderPanel(String text)
  {
     this.setBackground(Color.lightGray);
     Border bdr       = BorderFactory.createEtchedBorder();
     Border titlebdr  = BorderFactory.createTitledBorder(bdr ,text);
     this.setBorder(titlebdr );
  }

}