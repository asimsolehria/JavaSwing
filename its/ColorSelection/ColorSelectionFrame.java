package its.ColorSelection;

import javax.swing.*;
import java.awt.Color;
import java.awt.GridLayout;
import its.SimpleFrame.SimpleFrame;
import java.awt.event.*;

/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/


public class ColorSelectionFrame extends SimpleFrame {

  private JPanel colPanel;
  private JButton redBut, blueBut, yellowBut;


  public ColorSelectionFrame() {
    blueBut   = new JButton("blue");
    redBut    = new JButton("red");
    yellowBut = new JButton("yellow");

    ColorListener cList = new ColorListener();
    blueBut.addActionListener(cList);
    redBut.addActionListener(cList);
    yellowBut.addActionListener(cList);

    colPanel  = new JPanel();
    colPanel.setBackground(Color.gray);

    GridLayout gLayout = new GridLayout(2,2);
    this.getContentPane().setLayout(gLayout);

    this.getContentPane().add(blueBut);
    this.getContentPane().add(redBut);
    this.getContentPane().add(yellowBut);
    this.getContentPane().add(colPanel);


    this.setVisible(true);


  }

  // iternal class
   class ColorListener implements ActionListener{
     public void actionPerformed (ActionEvent evt)
     {

         String actComm = evt.getActionCommand();
         System.out.println(""+actComm);
         if(actComm.equals("blue")){
           colPanel.setBackground(Color.blue);
         } else if(actComm.equals("red")){
           colPanel.setBackground(Color.red);
         } else if(actComm.equals("yellow")){
           colPanel.setBackground(Color.yellow);
         }
     }//method
   }
  public static void main(String[] args) {
    ColorSelectionFrame colorSelectionFrame1 = new ColorSelectionFrame();
  }
}