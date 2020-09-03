package its.Tables;

import its.SimpleFrame.SimpleFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
/**
* Example program for Introduction to Swing
* @author Paul Fischer, IMM, DTU
* @version 1.0
*/
public class MultiplicationTableFrame extends SimpleFrame {

  public MultiplicationTableFrame(int r, int c) {
    MultiplicationTableModel multModel = new MultiplicationTableModel(r,c);
    JTable multTable = new JTable(multModel);
    multTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    JScrollPane scrollPane = new JScrollPane(multTable);
    this.setSize(350,250);
    this.getContentPane().add(scrollPane);
  }

  public static void main(String[] args) {
    MultiplicationTableFrame mtf30 =
        new MultiplicationTableFrame(30,30);
    mtf30.showIt("Multiplication Table");
  }
}