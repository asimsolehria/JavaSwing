package its.SplitPanes;

import its.SimpleFrame.SimpleFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.*;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class SplitPaneFrame extends SimpleFrame
{
  private JButton okButton;
  private JList list;
  private JLabel picLabel1, picLabel2;
  private ImageIcon picture1, picture2;

  private static String picturePath = "./its/TestData/";

  public SplitPaneFrame()
  {
   this.setSize(800,400);
   JSplitPane splitPane1 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
   JSplitPane splitPane2 = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
   splitPane1.setOneTouchExpandable(true);
   splitPane1.setDividerSize(20);

   this.getContentPane().add(splitPane1,BorderLayout.CENTER);
   splitPane1.setRightComponent(splitPane2);

   picture1 = new ImageIcon(picturePath+"/Orange.png");
   picture2 = new ImageIcon(picturePath+"/Banana.png");

   picLabel1 = new JLabel(picture1);
   JScrollPane sp2a = new JScrollPane(picLabel1);
   splitPane2.setTopComponent(sp2a);
   picLabel2 = new JLabel(picture2);
   JScrollPane sp2b = new JScrollPane(picLabel2);
   splitPane2.setBottomComponent(sp2b);
   splitPane2.setDividerLocation(150);
   splitPane1.setDividerLocation(100);

   File startFile = new File(picturePath);
   list = new JList(startFile.listFiles());
   JScrollPane sp = new JScrollPane(list);
   splitPane1.setLeftComponent(sp);

   okButton = new JButton("OK");
   okButton.setBackground(Color.cyan);
   this.getContentPane().add(okButton,BorderLayout.SOUTH);
   okButton.addActionListener(new ActionListener()
   {
     public void actionPerformed(ActionEvent e)
     {
        String filename = ((File)(list.getSelectedValue())).getPath();
       if((filename.endsWith(".png")) || (filename.endsWith(".jpg")) ||
          (filename.endsWith(".PNG")) || (filename.endsWith(".JPG")))
        {
          picLabel2.setIcon(new ImageIcon(filename));
        }
     }
   });
  }

  public static void main(String[] args)
  {
    SplitPaneFrame spf = new SplitPaneFrame();
    spf.showIt("Split-Panes",200,200);
  }
}