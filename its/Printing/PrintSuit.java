package its.Printing;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import javax.swing.RepaintManager;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class PrintSuit implements Printable {
  private Component compToPrint;

  public static void printComponent(Component comp) {
    new PrintSuit(comp).print();
  }

 private PrintSuit(Component comp) {
    this.compToPrint = comp;
  }

 public void print() {
    PrinterJob printJob = PrinterJob.getPrinterJob();
    printJob.setPrintable(this);
    if (printJob.printDialog()){
      try {
        printJob.print();
      } catch(PrinterException pex) {
              pex.printStackTrace();
      }
    }
  }

  public int print(Graphics g, PageFormat pageFormat, int pageIndex) {
    if (pageIndex > 0) {
      return(NO_SUCH_PAGE);
    } else {
      int  x = (int)pageFormat.getImageableX() + 1;
      int  y = (int)pageFormat.getImageableY() + 1;
      g.translate(x,y);
      RepaintManager currentManager = RepaintManager.currentManager(compToPrint);
      currentManager.setDoubleBufferingEnabled(false);
      compToPrint.paint(g);
      currentManager.setDoubleBufferingEnabled(true);
      return(PAGE_EXISTS);
    }
  }

}