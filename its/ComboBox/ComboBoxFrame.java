package its.ComboBox;

import its.SimpleFrame.SimpleFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import javax.swing.JButton;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class ComboBoxFrame extends SimpleFrame
                           implements ActionListener
{
  private DisplayDatePanel dispp;
  private CalendarPanel calen;
  public ComboBoxFrame()
  {
   dispp = new DisplayDatePanel();
   calen = new CalendarPanel();
   JButton     okButton = new JButton("OK");
   okButton.addActionListener(this);

   this.getContentPane().add(calen,BorderLayout.CENTER);
   this.getContentPane().add(dispp,BorderLayout.SOUTH);
   this.getContentPane().add(okButton,BorderLayout.EAST);

   this.pack();
  }

  public void actionPerformed(ActionEvent evt){
    dispp.setDate( calen.getDate() );
  }

  public static void main(String[] args){
    ComboBoxFrame cbf = new ComboBoxFrame();
    cbf.showIt("Combo boxes");
  }
}