package its.Printing;

import its.SimpleFrame.SimpleFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.awt.BorderLayout;
import javax.swing.*;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class PrintFrame extends SimpleFrame
                        implements ActionListener{

  private PrintPanel pp;

  public PrintFrame() {
    this.setTitle("Printing Application");
    pp = new PrintPanel();
    this.getContentPane().add(pp,BorderLayout.CENTER);

    JMenuBar menuBar = new JMenuBar();
    JMenu menu = new JMenu("File");
    JMenuItem druckItem = new JMenuItem("Print");
    menuBar.add(menu);
    menu.add(druckItem);
    druckItem.addActionListener(this);
    this.setJMenuBar(menuBar);
    pack();
  }

  public void actionPerformed(ActionEvent evt){
   String command = evt.getActionCommand();
   if(command.equals("Print"))
    {
    PrinterJob printJob = PrinterJob.getPrinterJob();
    printJob.setPrintable(pp);
    if (printJob.printDialog()){
      try {
        printJob.print();
      } catch(PrinterException pe) {
        System.out.println("Error printing: " + pe);
      }
    }
    }

  }
  public static void main(String[] args)
    {
      PrintFrame prfr = new PrintFrame();
      prfr.showIt();
  }

}