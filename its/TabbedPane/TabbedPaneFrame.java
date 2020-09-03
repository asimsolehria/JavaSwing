package its.TabbedPane;

import its.SimpleFrame.SimpleFrame;
import its.SimpleFrameWithPanels.ColorPanel;
import java.awt.Color;
import javax.swing.*;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class TabbedPaneFrame extends SimpleFrame
{

  private static String picturePath = "./its/TestData/";

  public TabbedPaneFrame()
  {
   // Create a tabbed pane and glue into the frame
    JTabbedPane tabbedPane = new JTabbedPane();
    this.getContentPane().add(tabbedPane);

  // Generate two labels each of which contains an image
  // and add them to the  tabbed pane
    ImageIcon plum = new ImageIcon(picturePath+"plum.png");
    JLabel plumLabel = new JLabel(plum);
    ImageIcon lime = new ImageIcon(picturePath+"lime.png");
    JLabel limeLabel = new JLabel(lime);

    tabbedPane.add("Plum",plumLabel);
    tabbedPane.add("Lime",limeLabel);

  // Generate a red panel from its.SimpleFrameWithPanels.ColorPanel
  // and add it.
    ColorPanel redPane = new ColorPanel(Color.red);
    tabbedPane.add("Red Pane", redPane);

 // Generate a text area and add it as the first (0-th)
 // component.
    JTextArea legend = new  JTextArea();
    legend.setText("Legend in a JTextArea\n"+
                   "JLabel showing a plum\n"+
                   "JLabel showing a lime\n"+
                   "A red Panel");
    tabbedPane.add(legend,0);
    tabbedPane.setTitleAt(0,"Legend");
    tabbedPane.setSelectedIndex(1);
  }

  public static void main(String[] args) {
    TabbedPaneFrame tpf = new TabbedPaneFrame();
    tpf.setSize(300,200);
    tpf.showIt("Tabbed Panes",200,200);
  }
}